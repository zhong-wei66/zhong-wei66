package com.zw.java300_13.proxy.staticProxy;
/**
 * 3.���������
 * @author Administrator
 *
 */
public class ProxyStar implements Star{
	private Star star;
	
	public ProxyStar(Star star) {//������ʵ����
		super();
		this.star = star;
	}

	@Override
	public void confer() {
		System.out.println("ProxyStar.confer()");
		
	}

	@Override
	public void signContract() {
		System.out.println("ProxyStar.signContract()");
		
	}

	@Override
	public void bookTicket() {
		System.out.println("ProxyStar.bookTicket()");
		
	}

	@Override
	public void sing() {
		star.sing();
		
	}

	@Override
	public void collectMoney() {
		System.out.println("ProxyStar.collectMoney()");
		
	}

}
