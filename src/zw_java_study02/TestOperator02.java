package zw_java_study02;

/**
 * 测试关系运算符
 * @author Administrator
 *
 */
public class TestOperator02 {
	public static void main(String[] args) {
		int a = 3;
		System.out.println(a==3);
		System.out.println(a!=3);
		System.out.println(a<5);
		
		char b = 'a';
		char b2 = 'c';
		System.out.println((int)b);//强制把字符类型转为int类型
		System.out.println(0+b2);
		System.out.println(b<b2);//char可用于比较，可直接转为Unicode编码
		
	}

}
