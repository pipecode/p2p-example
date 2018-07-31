package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Bank", propOrder = {

})
public class Bank {

	@XmlElement(required = true, nillable = true)
	protected String bankCode;
	@XmlElement(required = true, nillable = true)
	protected String bankName;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String value) {
		this.bankCode = value;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String value) {
		this.bankName = value;
	}

}
