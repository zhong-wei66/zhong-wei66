package com.zw.java300_13.iterator;
/**
 * �Զ���ĵ������ӿ�
 * @author Administrator
 *
 */
public interface MyIterator {
	void first();//���α�ָ���һ��Ԫ��
	void next();//���α�ָ����һ��Ԫ��
	boolean hasNext();//�ж��Ƿ������һ��Ԫ��
	boolean isFirst();
	boolean isLast();
	
	Object getCurrentObj();//��ȡ��ǰ�α�ָ��Ķ���
	
}
