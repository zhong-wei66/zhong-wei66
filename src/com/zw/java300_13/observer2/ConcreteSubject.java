package com.zw.java300_13.observer2;

import java.util.Observable;

//Ŀ�����
public class ConcreteSubject extends Observable{
	private int state;
	
	public void set(int s) {
		state = s;//Ŀ�����״̬�����˸ı�
		setChanged();//��ʾĿ������Ѿ����˸���
		notifyObservers(state);//֪ͨ���еĹ۲���
	}

	
	public int getState() {
		return state;
	}

	
	public void setState(int state) {
		this.state = state;
	}
	
	
}
