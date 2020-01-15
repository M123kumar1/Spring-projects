package com.ci.beans;

import java.util.List;
import java.util.Properties;

public class Store {
	private String storeName;
	private List<Product> products;
	private Properties floorManager;

	public void setFloorManager(Properties floorManager) {
		this.floorManager = floorManager;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", products=" + products + ", floorManager=" + floorManager + "]";
	}

}
