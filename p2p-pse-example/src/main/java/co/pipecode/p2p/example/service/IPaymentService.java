package co.pipecode.p2p.example.service;

import java.util.List;

import co.pipecode.p2p.client.entities.PSETransactionResponse;
import co.pipecode.p2p.client.entities.TransactionInformation;
import co.pipecode.p2p.example.domain.PaymentInfo;
import co.pipecode.p2p.example.repository.entity.Payment;

public interface IPaymentService {

	public PSETransactionResponse processPayment(PaymentInfo paymentInfo);

	public TransactionInformation getTransactionInformation(String reference);

	public Payment findByReference(String reference);

	public List<Payment> findByEstado(String estado);

	public List<Payment> findAll();
}
