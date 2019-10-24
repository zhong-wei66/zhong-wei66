package cn.zw.collection;

import java.io.ObjectInputStream.GetField;

/**
 * �Զ���һ������
 * ����remove����
 * @author Administrator
 *
 */

public class LinkedList03 {
	private Node first;//��һ���ڵ�
	private Node last;//���һ���ڵ�
	
	private int size;
	
	public void remove(int index) {
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
			
			//��ɾ����Ԫ���ǵ�һ��Ԫ��
			if (index==0) {
				first = down;
			}
			
			//��ɾ����Ԫ�������һ��Ԫ��
			if (index==size-1) {
				last = up;
			}
			
			size--;
		} 
		
	}
	
	
	//[]
	//["a","b","c","d","e","f"]
	public Object get(int index) {
		
		if (index<0||index>size-1) {
			throw new RuntimeException("�������Ϸ�"+index);
		}
		
		Node temp = getNode(index);
		return temp!=null?temp.element:null;
		
	}
	
	public Node getNode(int index) {
        Node temp = null;
		
		//���index<=(size>>1)���ǰ�����ң����index>(size>>1)��Ӻ���ǰ�ң�������Լʱ��
		if (index<=(size>>1)) {//size>>1�൱��size����2
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
		LinkedList03 list = new LinkedList03();
		
		list.add("a");//0
		list.add("b");//1
		list.add("c");//2
		list.add("d");//3
		list.add("e");//4
		list.add("f");//5
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		
	}
	

}
