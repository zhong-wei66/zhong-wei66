package cn.zw.collection;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import javax.management.RuntimeErrorException;

/**
 * ����remove
 * @author Administrator
 *
 */

public class ArrayList05<E> {
	private Object[] elementData;
	private int size;
	private static final int DEFALT_CAPACITY = 10;
	
	public ArrayList05() {
		elementData = new Object[DEFALT_CAPACITY];
	}

	public ArrayList05(int capacity) {
		
		if (capacity<0) {
			throw new RuntimeException("��������������Ϊ����");
		}else if (capacity==0) {
			elementData = new Object[DEFALT_CAPACITY];
		}else {
			elementData = new Object[capacity];
		}
		
		
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0?true:false;
	}
		
	public void add(E element) {
		
		//ʲôʱ������
		if (size==elementData.length) {
			//��ô����
			Object[] newArray = new Object[elementData.length+(elementData.length>>1)];//10����>10+10/2
			
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
		elementData[index] = element;//���Ĵ���
	}
	
	public void checkRange(int index) {
		//�����Ϸ��ж�[0,size)
				if (index<0 || index>size-1) {
					//���Ϸ�
					throw new RuntimeException("�������Ϸ���"+index);
				}
	}
	
	public void remove(E element) {
		//element������������Ԫ�ذ����Ƚϣ����һ���Ƚ�Ϊtrue�ģ�����
		for (int i = 0; i < size; i++) {
			if (element.equals(get(i))) {//���������еıȽϲ�������equals������==
				//����Ԫ�شӴ˴��Ƴ�
				remove(i);
				
			}
		}
		
	}
	
	public void remove(int index) {
		//a,b,c,d,e,f,g,h
		//a,b,c,e,f,g,h
		int numMoved = elementData.length-index-1;
		if (numMoved>0) {
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
			
		}
//		elementData[size-1] = null;
//		size--;
		elementData[--size] = null;
			
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
		ArrayList05 s1 = new ArrayList05();
		for (int i = 0; i < 40; i++) {
			s1.add("zhong"+i);
		}
		
		System.out.println(s1);
		s1.set("dddd", 10);
		System.out.println(s1.get(10));
		
		s1.remove(3);
		System.out.println(s1);
		System.out.println(s1.size);
		System.out.println(s1.isEmpty());
		
	}

}
