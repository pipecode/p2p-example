package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionInformation", propOrder = {

})
public class TransactionInformation {

	@XmlElement(required = true, type = Integer.class, nillable = true)
	protected Integer transactionID;
	@XmlElement(required = true, nillable = true)
	protected String sessionID;
	@XmlElement(required = true, nillable = true)
	protected String reference;
	@XmlElement(required = true, nillable = true)
	protected String requestDate;
	@XmlElement(required = true, nillable = true)
	protected String bankProcessDate;
	@XmlElement(required = true, type = Boolean.class, nillable = true)
	protected Boolean onTest;
	@XmlElement(required = true, nillable = true)
	protected String returnCode;
	@XmlElement(required = true, nillable = true)
	protected String trazabilityCode;
	@XmlElement(required = true, type = Integer.class, nillable = true)
	protected Integer transactionCycle;
	@XmlElement(required = true, nillable = true)
	protected String transactionState;
	@XmlElement(required = true, type = Integer.class, nillable = true)
	protected Integer responseCode;
	@XmlElement(required = true, nillable = true)
	protected String responseReasonCode;
	@XmlElement(required = true, nillable = true)
	protected String responseReasonText;

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

	public String getReference() {
		return reference;
	}

	public void setReference(String value) {
		this.reference = value;
	}

	public String getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(String value) {
		this.requestDate = value;
	}

	public String getBankProcessDate() {
		return bankProcessDate;
	}

	public void setBankProcessDate(String value) {
		this.bankProcessDate = value;
	}

	public Boolean isOnTest() {
		return onTest;
	}

	public void setOnTest(Boolean value) {
		this.onTest = value;
	}

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String value) {
		this.returnCode = value;
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

	public String getTransactionState() {
		return transactionState;
	}

	public void setTransactionState(String value) {
		this.transactionState = value;
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
