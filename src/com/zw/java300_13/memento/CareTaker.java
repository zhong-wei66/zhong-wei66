package com.zw.java300_13.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * @author Administrator
 *
 */
public class CareTaker {
	private EmpMemento memento;
//	private List<EmpMemento> list = new ArrayList<EmpMemento>();
	
	public EmpMemento getMemento() {
		return memento;
	}

	public void setMemento(EmpMemento memento) {
		this.memento = memento;
	}
	
}
