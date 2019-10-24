package cn.zw.collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

/**
 * 自定义实现一个ArrayList，体会底层原理
 * 增加set和get方法
 * 增加数组边界的检查
 * @author Administrator
 *
 */

public class ArrayList04<E> {
	private Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public ArrayList04() {
		elementData = new Object[DEFALT_CAPACITY];
	}

	public ArrayList04(int capacity) {
		
		if (capacity<0) {
			throw new RuntimeException("容器的容量不能为负数");
		}else if (capacity==0) {
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
		
		
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
	
	public Object get(int index) {
		checkRange(index);
		return (E)elementData[index];
	}
	
	public void set(E element,int index) {
		
		checkRange(index);
		elementData[index] = element;//核心代码
	}
	
	public void checkRange(int index) {
		//索引合法判断[0,size)
				if (index<0 || index>size-1) {
					//不合法
					throw new RuntimeException("索引不合法："+index);
				}
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
		ArrayList04 s1 = new ArrayList04();
		for (int i = 0; i < 40; i++) {
			s1.add("zhong"+i);
		}
		
		System.out.println(s1);
		s1.set("dddd", 10);
		System.out.println(s1.get(10));
		
	}

}
