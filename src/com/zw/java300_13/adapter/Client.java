package com.zw.java300_13.adapter;
/**
 * �ͻ���
 * 
 * @author Administrator
 *
 */
public class Client {
	public void test1(Target t) {
		t.handleReq();
	}
	
	public static void main(String[] args) {
		Client c = new Client();
		Adaptee a = new Adaptee();
//		Target t = new Adapter();
		Target t = new Adapter2(a);//a�Ǳ��������
		
		c.test1(t);
	}
}
