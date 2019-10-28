package cn.zw.collection;

import java.io.ObjectInputStream.GetField;

/**
 * 自定义一个链表
 * 增加小的封装、增加范型
 * @author Administrator
 *
 */

public class LinkedList05<E> {
	private Node first;//第一个节点
	private Node last;//最后一个节点
	
	private int size;
	
	public void add(int index,E element) {//alr+shift+r重构
		
		checkRange(index);
		
		Node newNode = new Node(element);
		Node temp = getNode(index);
		
		if (temp!=null) {
			Node up = temp.previoes;
			
			up.nextNode = newNode;
			newNode.previoes = up;
			
			newNode.nextNode = temp;
			temp.previoes = newNode;
		}
		
	}
	
	public void remove(int index) {
		
		checkRange(index);
		
		Node  temp = getNode(index);
		
		if (temp!=null) {
			Node up = temp.previoes;
			Node down = temp.nextNode;
			
			if (up!=null) {
				up.nextNode = down;
			}
			
			if (down!=null) {
				down.previoes = up;
			}
			
			//被删除的元素是第一个元素
			if (index==0) {
				first = down;
			}
			
			//被删除的元素是最后一个元素
			if (index==size-1) {
				last = up;
			}
			
			size--;
		} 
		
	}
	
	
	//[]
	//["a","b","c","d","e","f"]
	public E get(int index) {
		
		checkRange(index);
		
		Node temp = getNode(index);
		return temp!=null?(E)temp.element:null;
		
	}
	
	private void checkRange(int index) {
		
		if (index<0||index>size-1) {
			throw new RuntimeException("索引不合法"+index);
		}
	}
	
	private Node getNode(int index) {
		
		checkRange(index);
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
		
		return temp;
	}
	
	//[]
	//["a","b","c"]
	public void add(E element) {
		Node node = new Node(element);
		
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
		LinkedList05<String> list = new LinkedList05<>();
		
		list.add("a");//0
		list.add("b");//1
		list.add("c");//2
		list.add("d");//3
		list.add("e");//4
		list.add("f");//5
		
		System.out.println(list);
		System.out.println(list.get(1));
		
	}
	

}
