package zw_java_study03;
/**
 * �ݹ�
 * @author zhong_wei
 *
 */
public class TestRecursion01 {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d�׳˵Ľ����%s%n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("�ݹ��ʱ��%s%n",d2-d1);
		factorialLoop(10);
		
		
		
	}
	//�׳˷���
	static long factorial(int n) {
		if (n==1) {//�ݹ�ͷ
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
		System.out.printf("��ͨѭ����ʱ��" + (d4-d3));
		return result;
	}
}
