package com.zw.java300_13.mediator;

public class Client {
	public static void main(String[] args) {
		Mediator m = new President();//创建中介者对象
		Market market = new Market(m);
		Development devp = new Development(m);
		Finacial f = new Finacial(m);
		
		market.selfAction();
		market.outAction();
	}
}
