package com.zw.java300_13.prototype;

import java.util.Date;

/**
 * ����ԭ��ģ�ͣ�ǳ��¡��
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(12312321331L);
		Sheep s1 = new Sheep("����", date);//����һֻ��
//		Sheep s2 = (Sheep) s1.clone();
		
		System.out.println(s1);//��ӡs1����
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);//s1��s2ָ��ͬһ��date���󣬴˴��޸���birthdayֵ�������¡��s2��ֵ������ֵ
		System.out.println(s1.getBirthday());
		
		System.out.println("###################");
		//��¡s1���󣬿�¡��Ķ���s2��s1����һ��������
		Sheep s2 = (Sheep) s1.clone();//�ڴ˴���¡����14�п�¡��һ����
		s2.setSname("����");//���޸�s2�����ֵ
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
