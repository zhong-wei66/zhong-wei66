package zw_java_study03;

/**
 * ���ԣ������Ļ���ʹ��
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//ͨ�����������ͨ����
		TestMethod tm = new TestMethod();
		tm.printSXT();
		//tm.add(30, 40, 50);
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c);
		
	}
	
	void printSXT() {
		System.out.println("������ѧ��");
		System.out.println("�Ϻ���ѧ��");
		System.out.println("������ѧ��");
		
	}

	
	int add(int a,int b,int c) { //�з���ֵ����Ͳ�����void��Ҫ�Ƿ���ֵ��Ӧ������
		int sum = a+b+c;
		System.out.println(sum);
		return sum; //return �������ã��������������С�����ֵ
	}
	

}
