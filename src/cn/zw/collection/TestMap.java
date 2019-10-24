package cn.zw.collection;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * 测试HashMap的使用
 * @author Administrator
 *
 */

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("four"));
		
		Map<Integer, String> m2 = new HashMap<>();
//		m2.put(3, "三");
		m2.put(4, "四");
		m2.put(5, "五");
		
		m1.putAll(m2);//把m2中所有的键值对存放到m1
		System.out.println(m1);
		//map中键不能重复,如果重复了新的覆盖旧的
		m1.put(3, "三");
		System.out.println(m1);
		
	}

}
