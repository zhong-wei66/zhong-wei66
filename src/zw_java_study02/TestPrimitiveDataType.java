package zw_java_study02;

/**
 * 测试基本数据类型（整型类型）
 * @author Administrator
 *
 */
public class TestPrimitiveDataType {
	public static void main(String[] args) {
		//测试整型变量类型
		
		int a = 15;
		int b = 015;//0开头是八进制
		int c = 0x15;//0x开头是十六进制
		int d = 0b1101;//0b开头是二进制
		System.out.println(a);
		System.out.println(b);	
		System.out.println(c);	
		System.out.println(d);	
		
		byte age = 30;
		short salary = 30000;
		int population = 200000000; //整型常量默认是int类型
		long globalPopulation = 740000000000L;//后面加L就是一个long类型的常量
		
	}

}
