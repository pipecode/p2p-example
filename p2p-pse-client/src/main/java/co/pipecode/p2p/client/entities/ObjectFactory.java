package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public GetBankList createGetBankList() {
		return new GetBankList();
	}

	public Authentication createAuthentication() {
		return new Authentication();
	}

	public GetBankListResponse createGetBankListResponse() {
		return new GetBankListResponse();
	}

	public ArrayOfBank createArrayOfBank() {
		return new ArrayOfBank();
	}

	public CreateTransaction createCreateTransaction() {
		return new CreateTransaction();
	}

	public PSETransactionRequest createPSETransactionRequest() {
		return new PSETransactionRequest();
	}

	public CreateTransactionResponse createCreateTransactionResponse() {
		return new CreateTransactionResponse();
	}

	public PSETransactionResponse createPSETransactionResponse() {
		return new PSETransactionResponse();
	}

	public CreateTransactionMultiCredit createCreateTransactionMultiCredit() {
		return new CreateTransactionMultiCredit();
	}

	public PSETransactionMultiCreditRequest createPSETransactionMultiCreditRequest() {
		return new PSETransactionMultiCreditRequest();
	}

	public CreateTransactionMultiCreditResponse createCreateTransactionMultiCreditResponse() {
		return new CreateTransactionMultiCreditResponse();
	}

	public GetTransactionInformation createGetTransactionInformation() {
		return new GetTransactionInformation();
	}

	public GetTransactionInformationResponse createGetTransactionInformationResponse() {
		return new GetTransactionInformationResponse();
	}

	public TransactionInformation createTransactionInformation() {
		return new TransactionInformation();
	}

	public Attribute createAttribute() {
		return new Attribute();
	}

	public ArrayOfAttribute createArrayOfAttribute() {
		return new ArrayOfAttribute();
	}

	public Bank createBank() {
		return new Bank();
	}

	public Person createPerson() {
		return new Person();
	}

	public CreditConcept createCreditConcept() {
		return new CreditConcept();
	}

	public ArrayOfCreditconcept createArrayOfCreditconcept() {
		return new ArrayOfCreditconcept();
	}

}
