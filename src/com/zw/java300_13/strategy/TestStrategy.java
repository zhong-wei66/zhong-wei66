package com.zw.java300_13.strategy;
/**
 * ʵ�������Ƚ����ף�����һ�㿪����Ա��˼·
 * ���磬�����ر�࣬�㷨�Ƚϸ���ʱ�������������Ĵ���ͱ�úܳ�������ά����
 * ������������ͣ�����ҪƵ�����޸Ĵ˴��Ĵ��룡
 * �����Ͽ���ԭ��
 * @author Administrator
 *
 */
public class TestStrategy {
	public double getPrice(String type, double price) {

		if (type.equals("��ͨ�ͻ�С����")) {
			System.out.println("������,ԭ��");
			return price;
		} else if (type.equals("��ͨ�ͻ�������")) {
			System.out.println("�����");
			return price * 0.9;
		} else if (type.equals("�Ͽͻ�С����")) {
			System.out.println("�������");
			return price * 0.85;
		} else if (type.equals("�Ͽͻ�������")) {
			System.out.println("�����");
			return price * 0.8;
		}
		return price;
	}

}
