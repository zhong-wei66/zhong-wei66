package com.zw.java300_13.observer2;

import java.util.Observable;
import java.util.Observer;

public class ObserverA implements Observer{
	
	private int myState;
	
	@Override
	public void update(Observable o, Object arg) {
		myState = ((ConcreteSubject)o).getState();
		
	}

	/**
	 * @return the myState
	 */
	public int getMyState() {
		return myState;
	}

	/**
	 * @param myState the myState to set
	 */
	public void setMyState(int myState) {
		this.myState = myState;
	}
	
	

}
