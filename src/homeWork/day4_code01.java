package homeWork;
/**
 *�����ǵ����±�����1
 * 1. ��д Java ����
 * ������ʾ�˵����������䡣����һ������Person��
 *  ������Ӧ��������˽�����ԣ� ���� (name) ������ (age) ��
 *  ���幹�췽��������ʼ�����ݳ�Ա���ٶ�����ʾ(display()) �����������������ӡ������
 *  �� main �����д��������ʵ��Ȼ����Ϣ��ʾ��

 * @author Administrator
 *
 */

public class day4_code01{
	//����˽������
	private String name;
	private int age;
	
	//���幹�췽��
	public day4_code01(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		day4_code01 person=new day4_code01("����",5);
		person.display();
	}
}

