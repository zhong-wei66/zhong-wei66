package com.zw.java300_13.mediator;

import java.util.HashMap;
import java.util.Map;

//�н��ߵľ���ʵ����
public class President implements Mediator{
	
	private Map<String, Department> map = new HashMap<String, Department>();//��map������Ӧ��ͬ����
	
	@Override
	public void register(String dname, Department d) {
		map.put(dname, d);
	}

	@Override
	public void command(String dname) {
		map.get(dname).selfAction();
	}

}
