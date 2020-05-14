package com.zw.java300_13.strategy;

//普通客户小批量购买
public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("不打折，原价");
		return standarPrice;
	}

}
