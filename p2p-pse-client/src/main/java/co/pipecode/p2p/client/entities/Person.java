package co.pipecode.p2p.client.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Person", propOrder = {

})
public class Person {

	@XmlElement(required = true, nillable = true)
	protected String documentType;
	@XmlElement(required = true, nillable = true)
	protected String document;
	@XmlElement(required = true, nillable = true)
	protected String firstName;
	@XmlElement(required = true, nillable = true)
	protected String lastName;
	@XmlElement(required = true, nillable = true)
	protected String company;
	@XmlElement(required = true, nillable = true)
	protected String emailAddress;
	@XmlElement(required = true, nillable = true)
	protected String address;
	@XmlElement(required = true, nillable = true)
	protected String city;
	@XmlElement(required = true, nillable = true)
	protected String province;
	@XmlElement(required = true, nillable = true)
	protected String country;
	@XmlElement(required = true, nillable = true)
	protected String phone;
	@XmlElement(required = true, nillable = true)
	protected String mobile;
	@XmlElement(required = true, nillable = true)
	protected String postalCode;

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String value) {
		this.documentType = value;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String value) {
		this.document = value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String value) {
		this.lastName = value;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String value) {
		this.company = value;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String value) {
		this.emailAddress = value;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String value) {
		this.address = value;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String value) {
		this.city = value;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String value) {
		this.province = value;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String value) {
		this.country = value;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String value) {
		this.phone = value;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String value) {
		this.mobile = value;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String value) {
		this.postalCode = value;
	}

}
