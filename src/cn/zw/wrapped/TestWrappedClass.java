package cn.zw.wrapped;
/**
 * 包装类
 * @author Administrator
 *
 */

public class TestWrappedClass {
	public static void main(String[] args) {
		//基本数据类型转成包装类对象
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(30);//推荐这种写法
//		System.out.println(a);
//		System.out.println(b);
		
		//包装类对象转为基本数据类型
		int c = b.intValue();		
		double d=b.doubleValue();
		
		
//		System.out.println(c);
//		System.out.println(d);
		
		//字符串转为包装类对象
		Integer e=new Integer("999");
		Integer f=Integer.parseInt("999988");
		
//		System.out.println(e);		
//		System.out.println(f);

		
		//包装类对象转为字符串
		String str=f.toString();
//		System.out.println(f);
		
		//常见的常量
		System.out.println("int类型最大的整数："+Integer.MAX_VALUE);
		
	}

}
