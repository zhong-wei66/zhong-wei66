package com.zw.java300_13.templateMethod;

public abstract class BankTemplateMethod {
	//���巽��
	public void takeNumber() {
		System.out.println("ȡ���Ŷ�");
	}
	
	public abstract void transact();//��������ҵ��
	
	public void evaluate() {
		System.out.println("��������");
	}
	
	public final void process() {
		this.takeNumber();
		this.transact();
		this.evaluate();
	}
}
