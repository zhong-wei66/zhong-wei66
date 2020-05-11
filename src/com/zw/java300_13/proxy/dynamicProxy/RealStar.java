package com.zw.java300_13.proxy.dynamicProxy;
/**
 * 2.相关代理类（真实角色：明星）
 * @author Administrator
 *
 */
public class RealStar implements Star{

	@Override
	public void confer() {
		System.out.println("RealStar.confer");//此行代码可输入syst自动生成
		
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
		System.out.println("RealStar(周杰伦本人).sing");
		
	}

	@Override
	public void collectMoney() {
		System.out.println("RealStar.collectMoney");
		
	}

}
