package cn.zw_abstract;
/**
 * ������abstract
 * ��������������ڣ�Ϊ�����ṩͳһ��/�淶��ģ�塣�������ʵ����صĳ��󷽷�
 * @author Administrator
 *
 */

public abstract class Animal {
	
	//��һ������û��ʵ�֡��ڶ����������ʵ�֡�
	abstract public void shout();
	
	public void run() {
		System.out.println("�����ܣ�");
	}
	
	public static void main(String[] args) {
//		������new��ʵ���������࣬���ǿ���ʵ���������������
//		Animal a = new Animal();�ᱨ��
		Animal a = new Dog();
	}

}

class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("��������");
		
	}
	
}
