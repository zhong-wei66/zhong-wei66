package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ�����з���Ĵ���
 * 
 * @author Administrator
 *
 */
public class Demo02 {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("([a-z]+)([0-9]+)");
		
		//����Matcher����
		Matcher m = p.matcher("aa232**ssd445*sds223");

		while (m.find()==true) {
			System.out.println(m.group());//group(),group(0)ƥ���������ʽ�����ַ���
			System.out.println(m.group(1));//����ƥ��([a-z]+)�����ַ�
			System.out.println(m.group(2));//����ƥ��([0-9]+)�����ַ�
			
			
			
		}
		
		
	}
}
