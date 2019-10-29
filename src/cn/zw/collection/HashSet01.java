package cn.zw.collection;

import java.awt.List;
import java.util.HashMap;
import java.util.Set;

/**
 * 手工实现一个HashSet，更深刻理解HashSet底层原理
 * @author Administrator
 *
 */

public class HashSet01 {
	HashMap map;
	
	private static final Object PRESENT = new Object();
	
	public HashSet01(){
		map = new HashMap();
	}
	
	public int size() {
		return map.size();
	}
	
	public void add(Object o) {
		map.put(o, PRESENT);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		sb.append("[");
		
		for (Object key:map.keySet()) {
			sb.append(key+",");	
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		}
	
	public static void main(String[] args) {
		HashSet01 set = new HashSet01();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set );
	}
}
