package com.zw.java300_13.strategy;

//老客户大批量购买
public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("打八折");
		return standarPrice*0.8;
	}

}
