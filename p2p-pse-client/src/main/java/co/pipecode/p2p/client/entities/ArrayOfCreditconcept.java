package co.pipecode.p2p.client.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCreditconcept", propOrder = { "item" })
public class ArrayOfCreditconcept {

	protected List<CreditConcept> item;

	public List<CreditConcept> getItem() {
		if (item == null) {
			item = new ArrayList<CreditConcept>();
		}
		return this.item;
	}

}
