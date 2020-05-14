package com.zw.java300_13.iterator;
/**
 * 自定义聚合类
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
	
	//获取迭代器
	public MyIterator createIterator() {
		return new ConcreteIterator();
		
	}
	
	//使用内部类定义迭代器，可以直接使用外部类的属性
	private class ConcreteIterator implements MyIterator{
		
		private int curson;//定义游标用于记录遍历时的位置
		
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
