package com.zw.java300_14.regex.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ������ʽ�Ļ����÷�
 * �÷���
 * 1����������ʽ��ʾΪJava�е�һ������
 * 2����������ʽ��Ŀ���ַ�����������
 * @author Administrator
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		//����ַ�����asfsdf23323���Ƿ����ָ���ı��ʽ��\w+
		// \w:����һ����ĸ���ֻ��»���
		// +:���ʽ���ٳ���1�Σ��൱��{1,}
		Pattern p = Pattern.compile("\\w+");
		
		//����Matcher����
		Matcher m = p.matcher("asfsdf2&&3323");
		
//		boolean yesorno = m.matches();//matches()�����Խ������ַ��������ģʽƥ��
//		System.out.println(yesorno);
		
		
//		boolean yesorno2 = m.find();//find();�÷���ɨ����������У��������ģʽƥ�����һ��������
//		System.out.println(yesorno2);

//		System.out.println(m.find());//��һ��ƥ�����ǣ�true��asfsdf2
//		System.out.println(m.find());//�ڶ���ƥ�����ǣ�true��3323
//		System.out.println(m.find());//������ƥ�����ǣ�false
//		System.out.println(m.find());//�ڶ���ƥ�����ǣ�false
		
//		System.out.println(m.find());
//		System.out.println(m.group());//m.group()�����ҵ��������У�asfsdf2
//		System.out.println(m.find());
//		System.out.println(m.group());//�����ҵ��������У�3323
		
		while (m.find()==true) {
			System.out.println(m.group());//group(),group(0)ƥ���������ʽ�����ַ���
			System.out.println(m.group(0));
			
		}
		
		
	}
}
