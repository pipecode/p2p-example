package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "auth" })
@XmlRootElement(name = "getBankList")
public class GetBankList {

	@XmlElement(required = true, nillable = true)
	protected Authentication auth;

	public Authentication getAuth() {
		return auth;
	}

	public void setAuth(Authentication value) {
		this.auth = value;
	}

}
