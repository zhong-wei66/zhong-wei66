package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ������滻����
 * 
 */
public class Demo03 {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[0-9]");//��Ҫ�滻���ַ�
		
		//����Matcher����
		Matcher m = p.matcher("aa232**ssd445*sds223");

		//�滻
		String newStr = m.replaceAll("#");//�������滻Ϊ#
		System.out.println(newStr);
		
	}
}
