package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "auth", "transactionID" })
@XmlRootElement(name = "getTransactionInformation")
public class GetTransactionInformation {

	@XmlElement(required = true)
	protected Authentication auth;
	protected int transactionID;

	public Authentication getAuth() {
		return auth;
	}

	public void setAuth(Authentication value) {
		this.auth = value;
	}

	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int value) {
		this.transactionID = value;
	}

}
