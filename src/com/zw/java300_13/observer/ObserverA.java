package com.zw.java300_13.observer;

public class ObserverA implements Observer{
	
	private int myState;

	@Override
	public void update(Subject subject) {
		myState = ((ConcreteSubject)subject).getState();
		
	}
	
	public int getMyState() {
		return myState;
		
	}
	
	public void ssetMyState(int myState) {
		this.myState = myState;
	}
	
	
}
