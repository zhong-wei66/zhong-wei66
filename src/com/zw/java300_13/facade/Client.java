package com.zw.java300_13.facade;

public class Client {
	public static void main(String[] args) {
//		未使用外观模式
//		工商局 a = new 海淀区工商局();
//		a.checkName();
//		质监局 b = new 海淀区质监局();
//		b.orgCodeCertificate();
//		税务局  c  = new 海淀区税务局();
//		c.taxCertificate();
//		银行  d = new 中国工商银行();
//		d.openAccount();
		
//		使用了外观模式
		new RegisterFacade().register();
	}
	
}
