package cn.zw.wrapped;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 测试时间对象和字符串之间的相互转换
 * DateForma抽象类和SimpleDateForma实现类的使用
 * @author Administrator
 *
 */

public class TestDateFormat {
	public static void main(String[] args)throws ParseException {
		//把时间对象按照“格式字符串指定的格式”转换成相应的字符串
		DateFormat df= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");//按定义好的格式yyyy-mm-dd hh:mm:ss转化
		
		String str=df.format(new Date());//format把传进的时间对象转化为指定格式的字符串
		System.out.println(str);
		
		//把字符串按照“格式字符串指定的格式”转换成相应的时间对象
		DateFormat df2= new SimpleDateFormat("yyyy年mm月dd日 hh时mm分ss秒");
		Date date=df2.parse("2019年10月14日 14时22分00秒");
		System.out.println(date);
		
		//测试其他格式
		//利用D，获取时间对象时当前年份的第几天
		DateFormat df3= new SimpleDateFormat("D");
		String str3=df3.format(new Date());
		System.out.println(str3);
	}

}
