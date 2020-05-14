package com.zw.java300_13.mediator;

/**
 * 财务部门
 * @author Administrator
 *
 */
public class Finacial implements Department {
	
	private Mediator m; //持有中介者（总经理）的引用
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);//注册，当前对象同时注册到中介那，可相互找到
	}

	@Override
	public void selfAction() {
		System.out.println("财务部在数钱！");
	}

	@Override
	public void outAction() {
		System.out.println("财务部向总经理汇报工作，钱太多了，怎么花？");
	}

}
