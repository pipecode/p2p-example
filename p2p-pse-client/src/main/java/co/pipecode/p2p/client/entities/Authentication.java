package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Authentication", propOrder = {

})
public class Authentication {

	@XmlElement(required = true, nillable = true)
	protected String login;
	@XmlElement(required = true, nillable = true)
	protected String tranKey;
	@XmlElement(required = true, nillable = true)
	protected String seed;
	@XmlElement(required = true, nillable = true)
	protected ArrayOfAttribute additional;

	public String getLogin() {
		return login;
	}

	public void setLogin(String value) {
		this.login = value;
	}

	public String getTranKey() {
		return tranKey;
	}

	public void setTranKey(String value) {
		this.tranKey = value;
	}

	public String getSeed() {
		return seed;
	}

	public void setSeed(String value) {
		this.seed = value;
	}

	public ArrayOfAttribute getAdditional() {
		return additional;
	}

	public void setAdditional(ArrayOfAttribute value) {
		this.additional = value;
	}

}
