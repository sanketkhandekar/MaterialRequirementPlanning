package com.mrp.system;

import java.util.Arrays;
import java.util.List;

public class HandInventory {

	private String productType;
	private Integer stock;

	private static List<HandInventory> handInventories;
	//TODO Can be fetch from Database
	static {

		handInventories = Arrays.asList(new HandInventory(Prodcut.SEATS.toString(), 50),
				new HandInventory(Prodcut.FRAMES.toString(), 80), new HandInventory(Prodcut.BRAKE_SETS.toString(), 25),
				new HandInventory(Prodcut.BRAKE_PADDLES.toString(), 100),
				new HandInventory(Prodcut.HANDLEBEARS.toString(), 100),
				new HandInventory(Prodcut.BRAKE_CABELS.toString(), 75),
				new HandInventory(Prodcut.LEVERS.toString(), 60),
				new HandInventory(Prodcut.BRAKE_SHOES.toString(), 150),
				new HandInventory(Prodcut.WHEELS.toString(), 60), new HandInventory(Prodcut.TIERS.toString(), 80),
				new HandInventory(Prodcut.CHAINS.toString(), 100), new HandInventory(Prodcut.CRANK_SET.toString(), 50),
				new HandInventory(Prodcut.PADDLES.toString(), 150));
	}

	public HandInventory(String productType, Integer stock) {
		super();
		this.productType = productType;
		this.stock = stock;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	

	public static List<HandInventory> getHandInventories() {
		return handInventories;
	}

	@Override
	public String toString() {
		return "HandInventory [productType=" + productType + ", stock=" + stock + "]";
	}

}
