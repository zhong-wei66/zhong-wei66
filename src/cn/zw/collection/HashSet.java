package cn.zw.collection;

import java.util.HashMap;

/**
 * �ֹ�ʵ��һ��HashSet����������HashSet�ײ�ԭ��
 * @author Administrator
 *
 */

public class HashSet {
	HashMap map;
	
	private static final Object PRESENT = new Object();
	
	public HashSet(){
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
		HashSet set = new HashSet();
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		
		System.out.println(set );
		
	}
}
