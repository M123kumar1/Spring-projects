package com.ci.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Product {
	private String productName;
	private String manufacturer;
	private List<String> features;
	private Store Store;
	private Set<String> reviews;

	public void setReviews(Set<String> reviews) {
		this.reviews = reviews;
	}

	// private Map<String, Store>
	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setStore(Store store) {
		Store = store;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public void setFeatures(List<String> features) {
		this.features = features;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + ", manufacturer=" + manufacturer + ", features=" + features
				+ ", Store=" + Store + ", reviews=" + reviews + "]";
	}

}
