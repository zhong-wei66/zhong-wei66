package com.server.basic;

import java.lang.reflect.InvocationTargetException;

/**
 * ���䣺��Java���и��ֽṹ�����������ԡ���������������ӳ���һ������Java����
 * 1����ȡclass����
 * ���ַ�ʽ��Class.forName("����·��")
 * 2�����Զ�̬��������
 * clz.getConstructor().newInstance()
 * 
 * @author Administrator
 *
 */

public class ReflectTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		//���ַ�ʽ
		//1������.getClass()
		Iphone iphone = new Iphone();
		Class clz = iphone.getClass();
		
		//2.��.class()
		clz = Iphone.class;
		
		//3.Class.forName("����.����")
		clz = Class.forName("com.server.basic.Iphone");
		
		//��������
//		Iphone iphone2 = (Iphone)clz.newInstance();//���Ƽ�ʹ��
//		System.out.println(iphone2);
		
		Iphone iphone2 = (Iphone)clz.getConstructor().newInstance();//�Ƽ�ʹ��
		System.out.println(iphone2);
		
	}
}

class Iphone{
	public Iphone() {
		
	}
}

/**
 * �ؼ�����
package Test;

import java.lang.reflect.InvocationTargetException;

public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Class clz = Class.forName("Test.Iphone");
		Iphone iphone = (Iphone)clz.getConstructor().newInstance();
		System.out.println(iphone);

	}

}

class Iphone{
	public Iphone() {
		
	}
}
 
 */
