package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditConcept", propOrder = {

})
public class CreditConcept {

	@XmlElement(required = true, nillable = true)
	protected String entityCode;
	@XmlElement(required = true, nillable = true)
	protected String serviceCode;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double amountValue;
	@XmlElement(required = true, type = Double.class, nillable = true)
	protected Double taxValue;
	@XmlElement(required = true, nillable = true)
	protected String description;

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String value) {
		this.entityCode = value;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String value) {
		this.serviceCode = value;
	}

	public Double getAmountValue() {
		return amountValue;
	}

	public void setAmountValue(Double value) {
		this.amountValue = value;
	}

	public Double getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(Double value) {
		this.taxValue = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String value) {
		this.description = value;
	}

}
