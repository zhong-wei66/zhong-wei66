package com.zw.java300_13.strategy;

//�Ͽͻ�����������
public class OldCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����");
		return standarPrice*0.8;
	}

}
