package co.pipecode.p2p.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import co.pipecode.p2p.client.entities.PSETransactionResponse;
import co.pipecode.p2p.client.entities.TransactionInformation;
import co.pipecode.p2p.example.domain.PaymentInfo;
import co.pipecode.p2p.example.service.IBankService;
import co.pipecode.p2p.example.service.IPaymentService;

@Controller
public class MainController {

	@Autowired
	private IBankService bankService;

	@Autowired
	private IPaymentService paymentService;

	@RequestMapping("/")
	public String welcome(Model model) {
		try {
			model.addAttribute("banks", bankService.getBanks());
		} catch (Exception e) {
			model.addAttribute("errorMsg", "Error al obtener la lista de bancos: " + e.getMessage());
		}
		return "index";
	}

	@RequestMapping("/pay")
	public String processPayment(Model model, PaymentInfo paymentInfo,
			@RequestHeader(value = "User-Agent", defaultValue = "Unknown") String userAgent,
			@RequestHeader(value = "X-FORWARDED-FOR", defaultValue = "0.0.0.0") String clientIp) {
		paymentInfo.setIp(clientIp);
		paymentInfo.setAgent(userAgent);
		try {
			PSETransactionResponse response = paymentService.processPayment(paymentInfo);
			if (response.getReturnCode().equals("SUCCESS")) {
				return "redirect:" + response.getBankURL();
			} else {
				model.addAttribute("errorMsg", "Error creando la transaccion " + response.getResponseReasonText());
				return welcome(model);
			}

		} catch (Exception ex) {
			model.addAttribute("errorMsg", "Error grave creando la transaccion " + ex.getMessage());
			return welcome(model);
		}
	}

	@RequestMapping("/return")
	public String paymentConfirmation(Model model, @RequestParam(value = "reference") String reference) {
		try {
			TransactionInformation information = paymentService.getTransactionInformation(reference);
			if (information.getReturnCode().equals("SUCCESS")) {
				model.addAttribute("transaction", information);
			} else {
				model.addAttribute("errorMsg","Error al consultar la transaccion: " + information.getResponseReasonText());
			}
		} catch (Exception ex) {
			model.addAttribute("errorMsg", "Error grave al consultar la transaccion " + ex.getMessage());
		}
		return "confirm";
	}

	@RequestMapping("/history")
	public String history(Model model) {
		try {
			model.addAttribute("payments", paymentService.findAll());
		} catch (Exception e) {
			model.addAttribute("errorMsg", "Error al obtener la lista de pagos: " + e.getMessage());
		}
		return "history";
	}
}
