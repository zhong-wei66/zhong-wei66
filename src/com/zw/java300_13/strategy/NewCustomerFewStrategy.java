package com.zw.java300_13.strategy;

//��ͨ�ͻ�С��������
public class NewCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����ۣ�ԭ��");
		return standarPrice;
	}

}
