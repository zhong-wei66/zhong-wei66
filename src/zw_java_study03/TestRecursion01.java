package zw_java_study03;
/**
 * 递归
 * @author zhong_wei
 *
 */
public class TestRecursion01 {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d阶乘的结果：%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("递归费时：%s%n",d2-d1);
		factorialLoop(10);
		
		
		
	}
	//阶乘方法
	static long factorial(int n) {
		if (n==1) {//递归头
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	static long factorialLoop(int a) {
		long d3 = System.currentTimeMillis();
		long result = 1;
		while (a>1) {
			result *=a;
			a--;	
		}
		long d4 = System.currentTimeMillis();
		System.out.printf("普通循环耗时：" + (d4-d3));
		return result;
	}
}
