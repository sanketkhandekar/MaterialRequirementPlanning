package com.mrp.system;

public class BillJournal {
	
	private String productName;
	
	private Integer quantity;
	
	private Integer needToPurchase;

	public BillJournal(String productName, Integer quantity, Integer needToPurchase) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.needToPurchase = needToPurchase;
	}

	public String getProductName() {
		return productName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getNeedToPurchase() {
		return needToPurchase;
	}
	
	

}
