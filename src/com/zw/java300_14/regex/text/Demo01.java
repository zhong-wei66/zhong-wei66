package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式的基本用法
 * 用法：
 * 1、把正则表达式表示为Java中的一个对象
 * 2、把正则表达式和目标字符串关联起来
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//这个字符串：asfsdf23323，是否符合指定的表达式：\w+
		// \w:任意一个字母数字或下划线
		// +:表达式至少出现1次，相当于{1,}
		Pattern p = Pattern.compile("\\w+");
		
		//创建Matcher对象
		Matcher m = p.matcher("asfsdf2&&3323");
		
//		boolean yesorno = m.matches();//matches()：尝试将整个字符序列与该模式匹配
//		System.out.println(yesorno);
		
		
//		boolean yesorno2 = m.find();//find();该方法扫描输入的序列，查找与该模式匹配的下一个子序列
//		System.out.println(yesorno2);

//		System.out.println(m.find());//第一次匹配结果是：true：asfsdf2
//		System.out.println(m.find());//第二次匹配结果是：true：3323
//		System.out.println(m.find());//第三次匹配结果是：false
//		System.out.println(m.find());//第二次匹配结果是：false
		
//		System.out.println(m.find());
//		System.out.println(m.group());//m.group()返回找到的子序列：asfsdf2
//		System.out.println(m.find());
//		System.out.println(m.group());//返回找到的子序列：3323
		
		while (m.find()==true) {
			System.out.println(m.group());//group(),group(0)匹配整个表达式的子字符串
			System.out.println(m.group(0));
			
		}
		
		
	}
}
