package zw_java_study02;
/**
 * 测试算数运算符
 * @author Administrator
 *
 */

public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a+b; //报错，如果两个操作数没有long，结果为int。即使操作数全为short，byte，结果也是int。
		//int c2 = b2+b;//报错，如果两个操作数有一个为Long, 则结果也为long。
		float f1 = 3.14F;//3.14是double类型，浮点常量默认是double类型，直接付给float是不行的，需要再3.14后加F
		float d = b+b2;
		double d2 = b+b2;//表述范围较大时可以自动转，所以次数不报错
		
		
		//取余值的符号和黑区域的数一致
		System.out.println(9%5);
		System.out.println(-9%5);
		
		//测试自增、自减
		int i = 3;
		int j = i++;//先赋值给j，然后再自增
		System.out.println("i="+i+"\nj="+j);
		int m = 3;
		int n = ++m;//先自增，然后再赋值给n
		System.out.println("m="+m+"\nn="+n);
		
		
	}

}
