package com.zw.java300_13.strategy;

//�Ͽͻ�С��������
public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�������");
		return standarPrice*0.85;
	}

}
