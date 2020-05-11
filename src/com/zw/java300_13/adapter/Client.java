package com.zw.java300_13.adapter;
/**
 * 客户端
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
		Target t = new Adapter2(a);//a是被适配对象
		
		c.test1(t);
	}
}
