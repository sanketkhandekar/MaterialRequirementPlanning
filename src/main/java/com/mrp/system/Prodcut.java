package com.mrp.system;

public enum Prodcut {
	SEATS("Seats"),
	FRAMES("Frames"),
	BRAKE_SETS("Brake Sets"),
	BRAKE_PADDLES("Brake Paddles"),
	BRAKE_CABELS("Brake Cabels"),
	LEVERS("Leavers"),
	BRAKE_SHOES("brake Shoes"),
	HANDLEBEARS("HandleBars"),
	WHEELS("Wheels"),
	TIERS("Tires"),
	CHAINS("Chains"),
	CRANK_SET("crank Set"),
	PADDLES("Paddles");

	private String product;

	 Prodcut(String product) {
		this.product = product;
		
		
		
	}
	public String toString() {
		return product;
	}
	
	

}
