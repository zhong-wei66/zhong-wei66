package com.zw.java300_13.strategy;

//普通客户大批量购买
public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("打九折");
		return standarPrice*0.9;
	}

}
