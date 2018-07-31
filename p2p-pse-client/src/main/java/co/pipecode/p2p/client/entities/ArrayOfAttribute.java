package co.pipecode.p2p.client.entities;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttribute", propOrder = { "item" })
public class ArrayOfAttribute {

	protected List<Attribute> item;

	public List<Attribute> getItem() {
		if (item == null) {
			item = new ArrayList<Attribute>();
		}
		return this.item;
	}

}
