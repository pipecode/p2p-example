package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "getBankListResult" })
@XmlRootElement(name = "getBankListResponse")
public class GetBankListResponse {

	@XmlElement(required = true)
	protected ArrayOfBank getBankListResult;

	public ArrayOfBank getGetBankListResult() {
		return getBankListResult;
	}

	public void setGetBankListResult(ArrayOfBank value) {
		this.getBankListResult = value;
	}

}
