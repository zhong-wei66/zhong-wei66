package com.zw.java300_13.mediator;

/**
 * 市场部门
 * @author Administrator
 *
 */
public class Market implements Department {
	
	private Mediator m; //持有中介者（总经理）的引用
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);//注册，当前对象同时注册到中介那，可相互找到
	}

	@Override
	public void selfAction() {
		System.out.println("市场部跑去接项目！");
	}

	@Override
	public void outAction() {
		System.out.println("市场部向总经理汇报工作，项目承接进度，需要资金支持！");
		
		m.command("finacial");//调总经理的方法
	}

}
