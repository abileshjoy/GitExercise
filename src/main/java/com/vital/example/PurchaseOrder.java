package com.vital.example;

import javax.xml.bind.annotation.XmlElement;

public class PurchaseOrder {
	private String poNumber;
	private String supplierName;
	private String lineNumber;
	private String itemName;
	private String makerPart;
	private Double poQty;
	private Double balQty;

	@XmlElement(name = "PO_NUMBER")
	public String getPoNumber() {
		return poNumber;
	}

	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}

	@XmlElement(name = "SUPPLIER_NAME")
	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	@XmlElement(name = "LINE_NUMBER")
	public String getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}

	@XmlElement(name = "ITEM")
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@XmlElement(name = "MAKER_PART")
	public String getMakerPart() {
		return makerPart;
	}

	public void setMakerPart(String makerPart) {
		this.makerPart = makerPart;
	}

	@XmlElement(name = "PO_QTY")
	public Double getPoQty() {
		return poQty;
	}

	public void setPoQty(Double poQty) {
		this.poQty = poQty;
	}

	@XmlElement(name = "BAL_QTY")
	public Double getBalQty() {
		return balQty;
	}

	public void setBalQty(Double balQty) {
		this.balQty = balQty;
	}
}
