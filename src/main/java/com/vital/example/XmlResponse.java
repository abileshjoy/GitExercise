package com.vital.example;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/xml")
public class XmlResponse {
	@GET
	@Path("getEmployee")
	@Produces("application/xml")
	public EmployeeXml getCustomerInXML() {

		EmployeeXml employee = new EmployeeXml();
		employee.setId("1");
		employee.setName("Ceo");
		return employee;
	}
	
	@GET
	@Path("getPurchaseOrders")
	@Produces("application/xml")
	public BatchXml getPurchaseOrdersInXML() {
		BatchXml batchXml = new BatchXml();
		batchXml.setId("1");

		List<PurchaseOrder> purchaseOrderList = new ArrayList<PurchaseOrder>();
		PurchaseOrder po1 = new PurchaseOrder(); 
		po1.setPoNumber("PO1");
		po1.setSupplierName("Vendor1");
		po1.setLineNumber("Line1");
		po1.setItemName("Item1");
		po1.setMakerPart("Maker part1");	
		po1.setPoQty((double) 1250);
		po1.setBalQty((double) 250);
		
		PurchaseOrder po2 = new PurchaseOrder(); 
		po2.setPoNumber("PO2");
		po2.setSupplierName("Vendor2");
		po2.setLineNumber("Line2");
		po2.setItemName("Item2");
		po2.setMakerPart("Maker part2");	
		po2.setPoQty((double) 5250);
		po2.setBalQty((double) 750);
		
		purchaseOrderList.add(po1);
		purchaseOrderList.add(po2);
		
		batchXml.setPurchaseOrder(purchaseOrderList);
		return batchXml;
	}
}
