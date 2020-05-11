package com.zw.java300_13.prototype;

/**
 * ������ͨnew��ʽ���������clone��ʽ���������Ч�ʲ��죡
 * �����Ҫ��ʱ�䴴���������󣬲���new�Ĺ��̱ȽϺ�ʱ������Կ���ʹ��ԭ��ģʽ��
 * @author Administrator
 *
 */
public class Client4 {
	public static void testNew(int size) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < size; i++) {
			Laptop t = new Laptop();
			
		}
		long end = System.currentTimeMillis();
		System.out.println("new�ķ�ʽ������ʱ��"+(end-start));
	}
	
	public static void testClone(int size) throws CloneNotSupportedException {
		long start = System.currentTimeMillis();
		Laptop t = new Laptop();
		for (int i = 0; i < size; i++) {
			Laptop temp = (Laptop) t.clone();
			
		}
		long end = System.currentTimeMillis();
		System.out.println("clone�ķ�ʽ������ʱ��"+(end-start));
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		testNew(1000);
		testClone(1000);
	}
	
}

class Laptop implements Cloneable{//�ʼǱ�����
	public Laptop() {
		try {
			Thread.sleep(10);//ģ�ⴴ�������ʱ�Ĺ���
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();
		return obj;
	}
}