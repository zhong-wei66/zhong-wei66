package com.zw.java300_13.state;
/**
 * �������
 * @author Administrator
 *
 */
public class HomeContext {
	
	private State state;

	
	public void setState(State s) {
		System.out.println("�޸�״̬��");
		state = s;
		state.handle();
	}

	
	
}
