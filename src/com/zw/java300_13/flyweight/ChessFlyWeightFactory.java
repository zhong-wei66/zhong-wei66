package com.zw.java300_13.flyweight;
/**
 * ��Ԫ������
 * @author Administrator
 *
 */

import java.util.HashMap;
import java.util.Map;

public class ChessFlyWeightFactory {
	//��Ԫ��
	private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();
	
	public static ChessFlyWeight getChess(String color) {
		if (map.get(color)!=null) {
			return map.get(color);
		}else {
			ChessFlyWeight cfw = new ConcreteChess(color);
			map.put(color, cfw);
			return cfw;
		}
		
			
	}
}
