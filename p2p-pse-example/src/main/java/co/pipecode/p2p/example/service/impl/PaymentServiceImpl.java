package co.pipecode.p2p.example.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.pipecode.p2p.client.PSEClient;
import co.pipecode.p2p.client.entities.PSETransactionRequest;
import co.pipecode.p2p.client.entities.PSETransactionResponse;
import co.pipecode.p2p.client.entities.Person;
import co.pipecode.p2p.client.entities.TransactionInformation;
import co.pipecode.p2p.example.domain.PaymentInfo;
import co.pipecode.p2p.example.repository.PaymentRepository;
import co.pipecode.p2p.example.repository.entity.Payment;
import co.pipecode.p2p.example.service.IPaymentService;

@Service
public class PaymentServiceImpl implements IPaymentService {

	@Autowired
	private PSEClient pseClient;

	@Autowired
	private PaymentRepository paymentRepository;

	@Override
	public PSETransactionResponse processPayment(PaymentInfo paymentInfo) {
		Person person = new Person();
		person.setDocument(paymentInfo.getDocument());
		person.setDocumentType(paymentInfo.getDocType());
		person.setFirstName(paymentInfo.getName());
		person.setLastName(paymentInfo.getSurname());
		person.setEmailAddress(paymentInfo.getEmail());
		person.setMobile(paymentInfo.getPhone());

		String reference = String.valueOf(System.currentTimeMillis());
		PSETransactionRequest request = new PSETransactionRequest();
		request.setBankCode(paymentInfo.getBank());
		request.setBankInterface("0");
		request.setReturnURL("http://localhost:8080/return/?reference=" + reference);
		request.setReference(reference);
		request.setDescription("PAGO - PSE");
		request.setLanguage("ES");
		request.setCurrency("COP");
		request.setTotalAmount(Double.valueOf(paymentInfo.getAmount()));
		request.setPayer(person);
		request.setBuyer(person);
		request.setIpAddress(paymentInfo.getIp());
		request.setUserAgent(paymentInfo.getAgent());

		PSETransactionResponse response = pseClient.createTransaction(request);
		if (response.getReturnCode().equals("SUCCESS")) {
			paymentRepository.save(createPayment(response, paymentInfo, reference));
		}
		return response;
	}

	@Override
	public Payment findByReference(String reference) {
		return paymentRepository.findByReferencia(reference);
	}

	@Override
	public List<Payment> findByEstado(String estado) {
		return paymentRepository.findByEstado(estado);
	}

	@Override
	public List<Payment> findAll() {
		return (List<Payment>) paymentRepository.findAll();
	}

	public Payment createPayment(PSETransactionResponse response, PaymentInfo paymentInfo, String reference) {
		Payment payment = new Payment();
		payment.setNombre(paymentInfo.getName());
		payment.setApellidos(paymentInfo.getSurname());
		payment.setTipo_documento(paymentInfo.getDocType());
		payment.setNumero_documento(paymentInfo.getDocument());
		payment.setReferencia(reference);
		payment.setTransaccion(response.getTransactionID().toString());
		payment.setFecha_transaccion(new Date());
		payment.setEstado("PENDING");
		return payment;
	}

	@Override
	public TransactionInformation getTransactionInformation(String reference) {
		Payment payment = findByReference(reference);
		TransactionInformation information;
		if (payment != null) {
			information = pseClient.getTransactionInformation(Integer.valueOf(payment.getTransaccion()));
		} else {
			information = pseClient.getTransactionInformation(Integer.valueOf(reference));
		}
		if (information.getReturnCode().equals("SUCCESS")) {
			payment.setEstado(information.getTransactionState());
			paymentRepository.save(payment);
		}
		return information;
	}

}
