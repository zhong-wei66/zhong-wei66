package com.zw.java300_13.state;
/**
 * 空闲状态
 * @author Administrator
 *
 */
public class FreeState implements State{

	@Override
	public void handle() {
		System.out.println("空闲房间，没人住！");
	}

}
