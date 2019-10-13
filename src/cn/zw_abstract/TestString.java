package cn.zw_abstract;

/**
 *字符串类的基本用法
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("def");
		String str3 = "18"+19;
		String str4 = "abc"+"def";
		System.out.println(str3);
		
		
		System.out.println("############");
		
		String str10 ="zhongwei";
		String str11 ="zhongwei";
		String str12 =new String("zhongwei");
		
		System.out.println(str10==str11);//true,指向常量池中同一个字符串常量
		System.out.println(str12==str11);//false,str12是新建的一个对象，不存放在常量池中
		
		//通常比较字符串时都是比较字符串的值是否相等，用equals
		System.out.println(str12.equals(str11));
		
		
		
	}

}
