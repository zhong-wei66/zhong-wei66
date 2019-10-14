package cn.zw.wrapped;
/**
 *   String 类
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
		
		//编译器做了优化，直接在编译的手将字符串进行了拼接
		String str1="hello"+"java";//相当于str1="hellojava";
		String str2="hellojava";
		System.out.println(str1==str2);//true
		
		String str3="hello";
		String str4="java";
		String str5=str3+str4;
		//System.out.println(str5);
		//编译的时候不知道变量中存储的是什么，所以没办法在编译的时候优化
		System.out.println(str5==str2);//false
		
		System.out.println(str2.equals(str5));//true
		
	}

}
