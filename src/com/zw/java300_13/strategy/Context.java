package com.zw.java300_13.strategy;
/**
 * ����;���Ĳ����ཻ��
 * �����Ļ���������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ı仯
 * ���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͨ�����ԵĶ��󣬶�̬���л���ͬ���㷨
 * @author Administrator
 *
 */


public class Context {
	private Strategy strategy; //��ǰ���õ��㷨����
	
	//����ͨ�ع�������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	//����ͨ��set������ע��
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void pringPrice(double s) {
		System.out.println("���ñ��ۣ�"+strategy.getPrice(s));
	}
	
}
