package cn.zw_abstract;
/**
 * ���Խӿں�ʵ����
 * @author Administrator
 *
 */

public class TestInterface {
	public static void main(String[] args) {
		Voland voland = new Angel();
		voland.fly();
		
	}

}

/**
 * ���нӿ�
 * 
 */

interface Voland{
	//���峣��������д��Ϊ��public static final int FLY_HEIGHT = 1000;
	int FLY_HEIGHT = 1000;
	//��������࣬����д��Ϊ��public abstract void fly();
	void fly();
}

//������

interface Honest{
	void helpOther();
}

//ʵ�ֽӿ�

class Angel implements Voland,Honest{//ʵ�������ʵ�ֶ������ӿ�

	@Override
	public void helpOther() {
		System.out.println("�����ࣺ�������̹���·");
		
	}

	@Override
	public void fly() {
		System.out.println("������ʹ������������");
		
	}
	
}




