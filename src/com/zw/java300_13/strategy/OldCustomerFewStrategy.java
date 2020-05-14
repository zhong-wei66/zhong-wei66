package com.zw.java300_13.strategy;

//老客户小批量购买
public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("打八五折");
		return standarPrice*0.85;
	}

}
