package co.pipecode.p2p.client;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import co.pipecode.p2p.client.entities.Authentication;
import co.pipecode.p2p.client.entities.Bank;
import co.pipecode.p2p.client.entities.CreateTransaction;
import co.pipecode.p2p.client.entities.CreateTransactionResponse;
import co.pipecode.p2p.client.entities.GetBankList;
import co.pipecode.p2p.client.entities.GetBankListResponse;
import co.pipecode.p2p.client.entities.GetTransactionInformation;
import co.pipecode.p2p.client.entities.GetTransactionInformationResponse;
import co.pipecode.p2p.client.entities.PSETransactionRequest;
import co.pipecode.p2p.client.entities.PSETransactionResponse;
import co.pipecode.p2p.client.entities.TransactionInformation;

public class PSEClient extends WebServiceGatewaySupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(PSEClient.class);

	Authentication auth;

	public PSEClient(Authentication auth) {
		this.auth = auth;
	}

	public List<Bank> getBackList() {
		LOGGER.info("Realizando consulta de bancos");
		GetBankList request = new GetBankList();
		request.setAuth(auth);
		GetBankListResponse response = (GetBankListResponse) getWebServiceTemplate().marshalSendAndReceive(getDefaultUri(), request, new SoapActionCallback("getBankList"));
		LOGGER.info("Finaliza consulta de banco con " + response.getGetBankListResult().getItem().size() + " bancos");
		return response.getGetBankListResult().getItem();
	}

	public PSETransactionResponse createTransaction(PSETransactionRequest pseRequest) {
		LOGGER.info("Creando Transacción con PSE");
		CreateTransaction request = new CreateTransaction();
		request.setAuth(auth);
		request.setTransaction(pseRequest);
		CreateTransactionResponse response = (CreateTransactionResponse) getWebServiceTemplate().marshalSendAndReceive(getDefaultUri(), request, new SoapActionCallback("createTransaction"));
		LOGGER.info("Finaliza Transaccion con PSE con codigo " + response.getCreateTransactionResult().getResponseCode());
		return response.getCreateTransactionResult();
	}
	
	public TransactionInformation getTransactionInformation(int transactionId) {
		LOGGER.info("Consultando informacion de transaccion: " + transactionId);
		GetTransactionInformation request = new GetTransactionInformation();
		request.setAuth(auth);
		request.setTransactionID(transactionId);
		GetTransactionInformationResponse response = (GetTransactionInformationResponse) getWebServiceTemplate().marshalSendAndReceive(getDefaultUri(), request, new SoapActionCallback("getTransactionInformation"));
		LOGGER.info("Finaliza consulta de informacion de transaccion: "+ transactionId +"  con codigo " + response.getGetTransactionInformationResult().getResponseCode());
		return response.getGetTransactionInformationResult();
	}

}
