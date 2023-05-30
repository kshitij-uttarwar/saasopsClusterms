package com.reflexis.saasopsportal.cluster.entity;

public enum Product {
	WFM("WFM"),RTM("RTM"),RTA("RTA"),PSA("PSA");
	public String productName;
	
	private Product(String name){
		this.productName = name;
	}
}
