package com.ci.beans;

import java.util.Map;

public class StoreManager {
	private Map<String, Store> salesManager;

	public void setSalesManager(Map<String, Store> salesManager) {
		this.salesManager = salesManager;
	}

	@Override
	public String toString() {
		return "StoreManager [salesManager=" + salesManager + "]";
	}

	
}
