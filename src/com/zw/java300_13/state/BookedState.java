package com.zw.java300_13.state;
/**
 * ��Ԥ��״̬
 * @author Administrator
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("������Ԥ��,���˲���ס!");
	}

}
