package cn.zw.collection;

import java.util.ArrayList;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * @author Administrator
 *
 */

public class ArrayList01 {
	private Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public ArrayList01() {
		elementData = new Object[DEFALT_CAPACITY];
	}

	public ArrayList01(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(Object obj) {
		elementData[size++] = obj;
	}
	
	@Override
		public String toString() {
			//return elementData.toString();
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			for (int i=0;i<size;i++) {
				sb.append(elementData[i]+",");
			}
			//sb.append("]");
			sb.setCharAt(sb.length()-1, ']');
			return sb.toString();
		}
	
	public static void main(String[] args) {
		ArrayList01 s1 = new ArrayList01(20);
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s1);
		
	}

}
