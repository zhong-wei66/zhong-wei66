package com.zw.java300_13.proxy.dynamicProxy;
/**
 * 2.��ش����ࣨ��ʵ��ɫ�����ǣ�
 * @author Administrator
 *
 */
public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer");//���д��������syst�Զ�����
		
	}

	@Override
	public void signContract() {
		System.out.println("RealStar.signContract");
		
	}

	@Override
	public void bookTicket() {
		System.out.println("RealStar.bookTicket");
		
	}

	@Override
	public void sing() {
		System.out.println("RealStar(�ܽ��ױ���).sing");
		
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney");
		
	}

}
