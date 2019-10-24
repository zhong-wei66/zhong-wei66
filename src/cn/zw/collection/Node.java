package cn.zw.collection;

public class Node {
	Node previoes;//上一个节点
	Node nextNode;//下一个节点
	Object element;//元素数据
	
	//构造器
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
