package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSETransactionResponse", propOrder = {

})
public class PSETransactionResponse {

	@XmlElement(required = true, nillable = true)
	private String returnCode;
	@XmlElement(required = true, nillable = true)
	private String bankURL;
	@XmlElement(required = true, nillable = true)
	private String trazabilityCode;
	@XmlElement(required = true, type = Integer.class, nillable = true)
	private Integer transactionCycle;
	@XmlElement(required = true, type = Integer.class, nillable = true)
	private Integer transactionID;
	@XmlElement(required = true, nillable = true)
	private String sessionID;
	@XmlElement(required = true, nillable = true)
	private String bankCurrency;
	@XmlElement(required = true, type = Float.class, nillable = true)
	private Float bankFactor;
	@XmlElement(required = true, type = Integer.class, nillable = true)
	private Integer responseCode;
	@XmlElement(required = true, nillable = true)
	private String responseReasonCode;
	@XmlElement(required = true, nillable = true)
	private String responseReasonText;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String value) {
		this.returnCode = value;
	}

	public String getBankURL() {
		return bankURL;
	}

	public void setBankURL(String value) {
		this.bankURL = value;
	}

	public String getTrazabilityCode() {
		return trazabilityCode;
	}

	public void setTrazabilityCode(String value) {
		this.trazabilityCode = value;
	}

	public Integer getTransactionCycle() {
		return transactionCycle;
	}

	public void setTransactionCycle(Integer value) {
		this.transactionCycle = value;
	}

	public Integer getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Integer value) {
		this.transactionID = value;
	}

	public String getSessionID() {
		return sessionID;
	}

	public void setSessionID(String value) {
		this.sessionID = value;
	}

	public String getBankCurrency() {
		return bankCurrency;
	}

	public void setBankCurrency(String value) {
		this.bankCurrency = value;
	}

	public Float getBankFactor() {
		return bankFactor;
	}

	public void setBankFactor(Float value) {
		this.bankFactor = value;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer value) {
		this.responseCode = value;
	}

	public String getResponseReasonCode() {
		return responseReasonCode;
	}

	public void setResponseReasonCode(String value) {
		this.responseReasonCode = value;
	}

	public String getResponseReasonText() {
		return responseReasonText;
	}

	public void setResponseReasonText(String value) {
		this.responseReasonText = value;
	}

}
