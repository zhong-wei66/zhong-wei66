package cn.zw_abstract;
/**
 * �Ǿ�̬�ڲ���
 * @author Administrator
 *
 */

public class TestInnerClass {
	public static void main(String[] args) {
		//�����ڲ������Ҫ�����ڲ��������Ҫ�����ⲿ�����
		Outer.Inner inner= new Outer().new Inner();
		//���ڲ���ķ���
		inner.show();
		
	}

}

class Outer{
	private int age=10;
	
	public void testOuter() {
		System.out.println("Outer.testOuter()");
	}
	//����һ���Ǿ�̬�ڲ���	
	class Inner{
		//��ͨ�ڲ����в��ܼ�static������static����
		int age=20;
		public void show() {
			int age=30;
			System.out.println("�ⲿ��ĳ�Ա����age��"+Outer.this.age);
			System.out.println("�ڲ���ĳ�Ա����age��"+this.age);
			System.out.println("�ֲ�����age��"+age);
			
		}
	}
	
	
}
