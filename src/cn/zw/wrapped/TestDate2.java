package cn.zw.wrapped;

import java.util.Date;

/**
 * ��ʾ��8-14��Date���ʹ��
 * @author Administrator
 *
 */

public class TestDate2 {
	public static void main(String[] args) {
		Date date1 = new Date();//ʲô����������ӡ��ǰʱ��
		System.out.println(date1.toString());//��ӡ��ǰʱ�䣺Sun Nov 03 17:15:20 CST 2019
		long i = date1.getTime();//����Date�����ʾ�ĺ�����
		Date date2 = new Date(i-1000);
		Date date3 = new Date(i+1000);
		
		System.out.println(date1.after(date2));//true
		System.out.println(date1.before(date2));//false
		System.out.println(date1.equals(date2));//false
		System.out.println(date1.after(date3));//false
		System.out.println(date1.before(date3));//true
		System.out.println(date1.equals(date3));//false
		System.out.println(new Date(1000L * 60 *60 *24 *365 * 29).toString());
		
		
	}
}
