package com.zw.java300_13.prototype;

import java.util.Date;

/**
 * 测试原型模型（浅克隆）
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Date date = new Date(12312321331L);
		Sheep s1 = new Sheep("少莉", date);//建立一只羊
//		Sheep s2 = (Sheep) s1.clone();
		
		System.out.println(s1);//打印s1对象
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(23432432423L);//s1和s2指向同一个date对象，此处修改了birthday值，后面克隆的s2的值就是新值
		System.out.println(s1.getBirthday());
		
		System.out.println("###################");
		//克隆s1对象，克隆后的对象s2与s1保持一样的内容
		Sheep s2 = (Sheep) s1.clone();//在此处克隆和在14行克隆是一样的
		s2.setSname("多利");//可修改s2对象的值
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}
}
