package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "createTransactionMultiCreditResult" })
@XmlRootElement(name = "createTransactionMultiCreditResponse")
public class CreateTransactionMultiCreditResponse {

	@XmlElement(required = true)
	protected PSETransactionResponse createTransactionMultiCreditResult;

	public PSETransactionResponse getCreateTransactionMultiCreditResult() {
		return createTransactionMultiCreditResult;
	}

	public void setCreateTransactionMultiCreditResult(PSETransactionResponse value) {
		this.createTransactionMultiCreditResult = value;
	}

}
