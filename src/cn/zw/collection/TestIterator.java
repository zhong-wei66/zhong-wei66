package cn.zw.collection;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author Administrator
 *
 */

public class TestIterator {
	public static void main(String[] args) {
//		testIteratorList();
		testIteratorSet();
		
	}
	
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		//使用iterator遍历List
		for (Iterator<String> iter=list.iterator();iter.hasNext(); ) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}
	
	public static void testIteratorSet() {
		Set<String> set = new HashSet<String>();
		set.add("aa");
		set.add("bb");
		set.add("cc");
		
		//使用iterator遍历List
		for (Iterator<String> iter=set.iterator();iter.hasNext(); ) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}
	
	
}
