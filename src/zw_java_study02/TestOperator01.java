package zw_java_study02;
/**
 * �������������
 * @author Administrator
 *
 */

public class TestOperator01 {
	public static void main(String[] args) {
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a+b; //�����������������û��long�����Ϊint����ʹ������ȫΪshort��byte�����Ҳ��int��
		//int c2 = b2+b;//�������������������һ��ΪLong, ����ҲΪlong��
		float f1 = 3.14F;//3.14��double���ͣ����㳣��Ĭ����double���ͣ�ֱ�Ӹ���float�ǲ��еģ���Ҫ��3.14���F
		float d = b+b2;
		double d2 = b+b2;//������Χ�ϴ�ʱ�����Զ�ת�����Դ���������
		
		
		//ȡ��ֵ�ķ��źͺ��������һ��
		System.out.println(9%5);
		System.out.println(-9%5);
		
		//�����������Լ�
		int i = 3;
		int j = i++;//�ȸ�ֵ��j��Ȼ��������
		System.out.println("i="+i+"\nj="+j);
		int m = 3;
		int n = ++m;//��������Ȼ���ٸ�ֵ��n
		System.out.println("m="+m+"\nn="+n);
		
		
	}

}
