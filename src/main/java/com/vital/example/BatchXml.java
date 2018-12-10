package com.vital.example;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "batch")
public class BatchXml {
	private String name;
	private String id;

	@XmlElement
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private List<PurchaseOrder> purchaseOrder;

	@XmlElement(name = "PURCHASE_ORDERS")
	public List<PurchaseOrder> getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(List<PurchaseOrder> purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

}
