package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式对象的替换操作
 * 
 */
public class Demo03 {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[0-9]");//需要替换的字符
		
		//创建Matcher对象
		Matcher m = p.matcher("aa232**ssd445*sds223");

		//替换
		String newStr = m.replaceAll("#");//把数字替换为#
		System.out.println(newStr);
		
	}
}
