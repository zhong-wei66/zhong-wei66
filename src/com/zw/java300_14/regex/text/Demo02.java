package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式对象中分组的处理
 * 
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		
		//创建Matcher对象
		Matcher m = p.matcher("aa232**ssd445*sds223");

		while (m.find()==true) {
			System.out.println(m.group());//group(),group(0)匹配整个表达式的子字符串
			System.out.println(m.group(1));//返回匹配([a-z]+)的子字符
			System.out.println(m.group(2));//返回匹配([0-9]+)的子字符
			
			
			
		}
		
		
	}
}
