package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PSETransactionRequest", propOrder = {

})
public class PSETransactionRequest {

	@XmlElement(required = true, nillable = true)
	protected String bankCode;
	@XmlElement(required = true, nillable = true)
	protected String bankInterface;
	@XmlElement(required = true, nillable = true)
	protected String returnURL;
	@XmlElement(required = true, nillable = true)
	protected String reference;
	@XmlElement(required = true, nillable = true)
	protected String description;
	@XmlElement(required = true, nillable = true)
	protected String language;
	@XmlElement(required = true, nillable = true)
	protected String currency;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double totalAmount;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double taxAmount;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double devolutionBase;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double tipAmount;
	@XmlElement(required = true, nillable = true)
	protected Person payer;
	@XmlElement(required = true, nillable = true)
	protected Person buyer;
	@XmlElement(required = true, nillable = true)
	protected Person shipping;
	@XmlElement(required = true, nillable = true)
	protected String ipAddress;
	@XmlElement(required = true, nillable = true)
	protected String userAgent;
	@XmlElement(required = true, nillable = true)
	protected ArrayOfAttribute additionalData;

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String value) {
		this.bankCode = value;
	}

	public String getBankInterface() {
		return bankInterface;
	}

	public void setBankInterface(String value) {
		this.bankInterface = value;
	}

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String value) {
		this.returnURL = value;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String value) {
		this.reference = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String value) {
		this.language = value;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String value) {
		this.currency = value;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double value) {
		this.totalAmount = value;
	}

	public Double getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Double value) {
		this.taxAmount = value;
	}

	public Double getDevolutionBase() {
		return devolutionBase;
	}

	public void setDevolutionBase(Double value) {
		this.devolutionBase = value;
	}

	public Double getTipAmount() {
		return tipAmount;
	}

	public void setTipAmount(Double value) {
		this.tipAmount = value;
	}

	public Person getPayer() {
		return payer;
	}

	public void setPayer(Person value) {
		this.payer = value;
	}

	public Person getBuyer() {
		return buyer;
	}

	public void setBuyer(Person value) {
		this.buyer = value;
	}

	public Person getShipping() {
		return shipping;
	}

	public void setShipping(Person value) {
		this.shipping = value;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String value) {
		this.ipAddress = value;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String value) {
		this.userAgent = value;
	}

	public ArrayOfAttribute getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(ArrayOfAttribute value) {
		this.additionalData = value;
	}

}
