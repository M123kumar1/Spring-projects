package com.ci.beans;

import java.util.Map;

public class StoreAddress {
	private Map<String, Store> storeAddress;

	public void setStoreAddress(Map<String, Store> storeAddress) {
		this.storeAddress = storeAddress;
	}

	@Override
	public String toString() {
		return "StoreAddress [storeAddress=" + storeAddress + "]";
	}

}
