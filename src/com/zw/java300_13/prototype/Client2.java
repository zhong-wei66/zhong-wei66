package com.zw.java300_13.prototype;

import java.util.Date;

/**
 * ԭ��ģʽ����ƣ�
 * @author Administrator
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {	
		Date date = new Date(12312321331L);
		Sheep2 s1 = new Sheep2("����", date);//����һֻ��
		Sheep2 s2 = (Sheep2) s1.clone();//ʵ����ƣ�s2�Ķ���birthday��һ���¶���
		
		System.out.println(s1);//��ӡs1����
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);
		System.out.println(s1.getBirthday());
		
		System.out.println("###################");

		s2.setSname("����");//���޸�s2�����ֵ
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());//����s1�����birthday��ʱ�䣬��Ӱ��s2����

	}
}