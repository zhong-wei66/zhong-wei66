package cn.zw.wrapped;
/**
 * ���ӻ���������
 */

import java.awt.DefaultKeyboardFocusManager;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalender2 {
	public static void main(String[] args)throws ParseException {
		String str="2020-10-10";
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");//��ʽ��ʱ�����
		Date date=df.parse(str);//����ʱ�����
		
		Calendar c=new GregorianCalendar();
		c.setTime(date);
		
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
		
	}

}
