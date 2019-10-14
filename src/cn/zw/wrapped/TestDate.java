package cn.zw.wrapped;

import java.util.Date;

/**
 * Date类的常用方法
 * @author Administrator
 *
 */

public class TestDate {
	public static void main(String[] args) {
		Date d=new Date();//什么都不传，打印当前时间
		System.out.println(d);
		
		Date d1=new Date(2000);
		System.out.println(d1);
		
		Date d2=new Date();
		System.out.println(d2.getTime());//获得毫秒数
		System.out.println(d2.after(d));//测试日期d2是否在指定日期d之后
	}

}
