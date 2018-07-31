package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "createTransactionResult" })
@XmlRootElement(name = "createTransactionResponse")
public class CreateTransactionResponse {

	@XmlElement(required = true)
	private PSETransactionResponse createTransactionResult;

	public PSETransactionResponse getCreateTransactionResult() {
		return createTransactionResult;
	}

	public void setCreateTransactionResult(PSETransactionResponse value) {
		this.createTransactionResult = value;
	}

}
