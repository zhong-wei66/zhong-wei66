package cn.zw.collection;

import java.util.ArrayList;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * 增加数组扩容功能
 * @author Administrator
 *
 */

public class ArrayList03<E> {
	private Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public ArrayList03() {
		elementData = new Object[DEFALT_CAPACITY];
	}

	public ArrayList03(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		
		//什么时候扩容
		if (size==elementData.length) {
			//怎么扩容
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10——>10+10/2
			
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
			
		}
		
		elementData[size++] = element;
		
		
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
		ArrayList03 s1 = new ArrayList03();
		for (int i = 0; i < 40; i++) {
			s1.add("zhong"+i);
		}
		
		System.out.println(s1);
		
	}

}
