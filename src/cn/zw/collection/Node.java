package cn.zw.collection;

public class Node {
	Node previoes;//��һ���ڵ�
	Node nextNode;//��һ���ڵ�
	Object element;//Ԫ������
	
	//������
	public Node(Node previoes, Node nextNode, Object element) {
		super();
		this.previoes = previoes;
		this.nextNode = nextNode;
		this.element = element;
	}

	public Node(Object element) {
		super();
		this.element = element;
	}
	
	
 
}
