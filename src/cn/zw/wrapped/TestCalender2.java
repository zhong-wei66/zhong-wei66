package cn.zw.wrapped;
/**
 * 可视化日历程序
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
		DateFormat df=new SimpleDateFormat("yyyy-mm-dd");//格式化时间对象
		Date date=df.parse(str);//生成时间对象
		
		Calendar c=new GregorianCalendar();
		c.setTime(date);
		
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		
	}

}
