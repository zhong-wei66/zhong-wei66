package com.zw.java300_13.bridge;
/**
 * ����Ʒ��
 * @author Administrator
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("�����������");	
	}
	
}
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("����Dell����");	
	}
	
}
class ShenZhou implements Brand{

	@Override
	public void sale() {
		System.out.println("�������۵���");	
	}
	
}


