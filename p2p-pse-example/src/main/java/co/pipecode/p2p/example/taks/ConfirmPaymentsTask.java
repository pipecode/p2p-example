package co.pipecode.p2p.example.taks;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import co.pipecode.p2p.client.entities.TransactionInformation;
import co.pipecode.p2p.example.repository.PaymentRepository;
import co.pipecode.p2p.example.repository.entity.Payment;
import co.pipecode.p2p.example.service.IPaymentService;

@Component
public class ConfirmPaymentsTask {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConfirmPaymentsTask.class);

	@Autowired
	private IPaymentService paymentService;

	@Autowired
	private PaymentRepository paymentRepository;

	@Scheduled(fixedRate = 60000)
	public void confirmPendingPayments() {
		LOGGER.info("Inicia Tarea Programada de confirmacion de pagos pendientes");
		List<Payment> payments = paymentRepository.findByEstado("PENDING");
		LOGGER.info("Se encontraron " + payments.size() + " Pendientes");
		for (Payment payment : payments) {
			TransactionInformation information = paymentService.getTransactionInformation(payment.getReferencia());
			if (information.getReturnCode().equals("SUCCESS") && !information.getTransactionState().equals("PENDING")) {
				payment.setEstado(information.getTransactionState());
				paymentRepository.save(payment);
				LOGGER.info("Se actualizo estado del pago con referencia " + payment.getReferencia());
			} else {
				LOGGER.info("Pago con referencia " + payment.getReferencia() + " continua en estado Pendiente");
			}
		}
	}
}
