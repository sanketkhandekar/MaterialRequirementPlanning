package com.mrp.system;

import java.util.Arrays;
import java.util.List;

public class BycleBuild {

	private String product;
	private Integer quantity;
	private transient Integer ratio;
	private static List<BycleBuild> buildForBycles;

	static {
		buildForBycles = Arrays.asList(new BycleBuild(Prodcut.SEATS.toString(), 1),
				new BycleBuild(Prodcut.FRAMES.toString(), 1), new BycleBuild(Prodcut.BRAKE_SETS.toString(), 2),
				new BycleBuild(Prodcut.HANDLEBEARS.toString(), 1), new BycleBuild(Prodcut.WHEELS.toString(), 2),
				new BycleBuild(Prodcut.TIERS.toString(), 2), new BycleBuild(Prodcut.CHAINS.toString(), 1),
				new BycleBuild(Prodcut.CRANK_SET.toString(), 1), new BycleBuild(Prodcut.PADDLES.toString(), 2));

	}

	public BycleBuild(String product, Integer quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.ratio = quantity / 1;
	}

	public String getProduct() {
		return product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public Integer getRatio() {
		return ratio;
	}

	@Override
	public String toString() {
		return "RatioType [product=" + product + ", ratio=" + ratio + "]";
	}

	public static List<BycleBuild> getBycleBuild() {
		return buildForBycles;
	}

}
