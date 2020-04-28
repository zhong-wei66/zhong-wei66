package com.zw.java300_13.prototype;

import java.util.Date;

/**
 * 原型模式（深复制）
 * @author Administrator
 *
 */
public class Client2 {
	public static void main(String[] args) throws CloneNotSupportedException {	
		Date date = new Date(12312321331L);
		Sheep2 s1 = new Sheep2("少莉", date);//建立一只羊
		Sheep2 s2 = (Sheep2) s1.clone();//实现深复制，s2的对象birthday是一个新对象
		
		System.out.println(s1);//打印s1对象
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);
		System.out.println(s1.getBirthday());
		
		System.out.println("###################");

		s2.setSname("多利");//可修改s2对象的值
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());//改了s1对象的birthday的时间，不影响s2对象

	}
}