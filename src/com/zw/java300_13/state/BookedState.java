package com.zw.java300_13.state;
/**
 * 已预定状态
 * @author Administrator
 *
 */
public class BookedState implements State{

	@Override
	public void handle() {
		System.out.println("房间已预定,别人不能住!");
	}

}
