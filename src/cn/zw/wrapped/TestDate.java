package cn.zw.wrapped;

import java.util.Date;

/**
 * Date��ĳ��÷���
 * @author Administrator
 *
 */

public class TestDate {
	public static void main(String[] args) {
		Date d=new Date();//ʲô����������ӡ��ǰʱ��
		System.out.println(d);
		
		Date d1=new Date(2000);
		System.out.println(d1);
		
		Date d2=new Date();
		System.out.println(d2.getTime());//��ú�����
		System.out.println(d2.after(d));//��������d2�Ƿ���ָ������d֮��
	}

}
