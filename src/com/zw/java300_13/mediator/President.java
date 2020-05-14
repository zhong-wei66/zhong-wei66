package com.zw.java300_13.mediator;

import java.util.HashMap;
import java.util.Map;

//中介者的具体实现类
public class President implements Mediator{
	
	private Map<String, Department> map = new HashMap<String, Department>();//在map里存放相应的同事类
	
	@Override
	public void register(String dname, Department d) {
		map.put(dname, d);
	}

	@Override
	public void command(String dname) {
		map.get(dname).selfAction();
	}

}
