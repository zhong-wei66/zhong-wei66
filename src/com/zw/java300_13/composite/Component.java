package com.zw.java300_13.composite;
/**
 * �������
 * @author Administrator
 *
 */
public interface Component {
	void operation();
	
}

//Ҷ�����
interface Leaf extends Component{
	
}

//�������
interface composite extends Component{
	void add(Component c);
	void remove(Component c);
	Component getChild(int index);
}
