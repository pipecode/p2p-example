package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getTransactionInformationResult" })
@XmlRootElement(name = "getTransactionInformationResponse")
public class GetTransactionInformationResponse {

	@XmlElement(required = true)
	protected TransactionInformation getTransactionInformationResult;

	public TransactionInformation getGetTransactionInformationResult() {
		return getTransactionInformationResult;
	}

	public void setGetTransactionInformationResult(TransactionInformation value) {
		this.getTransactionInformationResult = value;
	}

}
