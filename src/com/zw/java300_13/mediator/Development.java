package com.zw.java300_13.mediator;

/**
 * 研发部门
 * @author Administrator
 *
 */
public class Development implements Department {
	
	private Mediator m; //持有中介者（总经理）的引用
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);//注册，当前对象同时注册到中介那，可相互找到
	}

	@Override
	public void selfAction() {
		System.out.println("研发部专心科研，开发项目！");
	}

	@Override
	public void outAction() {
		System.out.println("研发部向总经理汇报工作，没钱了，需要资金支持！");
	}

}
