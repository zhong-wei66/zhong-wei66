package com.zw.java300_13.iterator;
/**
 * �Զ���ۺ���
 * @author Administrator
 *
 */

import java.util.ArrayList;
import java.util.List;

public class ConcreteMyAggregate {
	private List<Object> list = new ArrayList<Object>();
	
	public void addObject(Object obj) {
		this.list.add(obj);
	}
	public void removeObject(Object obj) {
		this.list.remove(obj);
	}
	
	public List<Object> getList(){
		return list;
	}
	
	public void setList(List<Object> list) {
		this.list = list;
	}
	
	//��ȡ������
	public MyIterator createIterator() {
		return new ConcreteIterator();
		
	}
	
	//ʹ���ڲ��ඨ�������������ֱ��ʹ���ⲿ�������
	private class ConcreteIterator implements MyIterator{
		
		private int curson;//�����α����ڼ�¼����ʱ��λ��
		
		@Override
		public void first() {
			curson = 0;
		}

		@Override
		public void next() {
			if (curson<list.size()) {
				curson++;
			}
		}

		@Override
		public boolean hasNext() {
			if (curson<list.size()) {
				return true;
			}
			return false;
		}

		@Override
		public boolean isFirst() {
			return curson==0?true:false;
		}

		@Override
		public boolean isLast() {
			return curson==(list.size()-1)?true:false;
		}

		@Override
		public Object getCurrentObj() {
			return list.get(curson);
		}
		
	}
	
}
