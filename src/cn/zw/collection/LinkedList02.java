package cn.zw.collection;

import java.io.ObjectInputStream.GetField;

/**
 * 自定义一个链表
 * 增加get方法
 * @author Administrator
 *
 */

public class LinkedList02 {
	private Node first;//第一个节点
	private Node last;//最后一个节点
	
	private int size;
	
	//[]
	//["a","b","c","d","e","f"]
	public Object get(int index) {
		
		if (index<0||index>size-1) {
			throw new RuntimeException("索引不合法"+index);
		}
		
		Node temp = null;
		
		//如果index<=(size>>1)则从前往后找，如果index>(size>>1)则从后往前找，这样节约时间
		if (index<=(size>>1)) {//size>>1相当于size除以2
			temp = first;
			for (int i = 0; i < index; i++) {
				temp = temp.nextNode;
			}
			
		}else {
			temp = last;
			for (int i = size-1; i > index; i--) {
				temp = temp.previoes;
			}
		}
		
		
		return temp.element;
		
	}
	
	//[]
	//["a","b","c"]
	public void add(Object obj) {
		Node node = new Node(obj);
		
		if (first==null) {
			
			first = node;
			last = node;
		}else {
			
			node.previoes = last;
			node.nextNode  = null;
			
			last.nextNode = node;
			last = node;
		}
		size++;
	}
	@Override
	public String toString() {	
		//["a","b","c"]
		
		StringBuilder sb = new StringBuilder("[");
		
		Node temp = first;
		while (temp!=null) {
			sb.append(temp.element+",");
			temp = temp.nextNode;
		}
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		LinkedList02 list = new LinkedList02();
		
		list.add("a");//0
		list.add("b");//1
		list.add("c");//2
		list.add("d");//3
		list.add("e");//4
		list.add("f");//5
		
		System.out.println(list.get(3));
	}
	

}
