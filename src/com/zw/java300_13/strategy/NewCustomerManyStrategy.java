package com.zw.java300_13.strategy;

//��ͨ�ͻ�����������
public class NewCustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����");
		return standarPrice*0.9;
	}

}
