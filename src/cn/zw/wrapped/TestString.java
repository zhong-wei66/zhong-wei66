package cn.zw.wrapped;
/**
 *   String ��
 * @author Administrator
 *
 */

public class TestString {
	public static void main(String[] args) {
		String str0="aaaabbbb";
		String str=str0.substring(2,5);
		System.out.println(str0);
		System.out.println(str);
		
		
		System.out.println("##################");
		
		//�����������Ż���ֱ���ڱ�����ֽ��ַ���������ƴ��
		String str1="hello"+"java";//�൱��str1="hellojava";
		String str2="hellojava";
		System.out.println(str1==str2);//true
		
		String str3="hello";
		String str4="java";
		String str5=str3+str4;
		//System.out.println(str5);
		//�����ʱ��֪�������д洢����ʲô������û�취�ڱ����ʱ���Ż�
		System.out.println(str5==str2);//false
		
		System.out.println(str2.equals(str5));//true
		
	}

}
