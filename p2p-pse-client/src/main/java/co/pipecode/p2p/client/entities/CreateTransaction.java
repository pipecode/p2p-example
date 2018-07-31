package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "auth", "transaction" })
@XmlRootElement(name = "createTransaction")
public class CreateTransaction {

	@XmlElement(required = true)
	protected Authentication auth;
	@XmlElement(required = true)
	protected PSETransactionRequest transaction;

	public Authentication getAuth() {
		return auth;
	}

	public void setAuth(Authentication value) {
		this.auth = value;
	}

	public PSETransactionRequest getTransaction() {
		return transaction;
	}

	public void setTransaction(PSETransactionRequest value) {
		this.transaction = value;
	}

}
