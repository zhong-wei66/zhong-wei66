package cn.zw.collection;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author Administrator
 *
 */

public class TestIterator {
	public static void main(String[] args) {
		testIteratorList();
		
	}
	
	public static void testIteratorList() {
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		
		// π”√iterator±È¿˙List
		for (Iterator<String> iter=list.iterator();iter.hasNext(); ) {
			String temp = iter.next();
			System.out.println(temp);
		}
		
	}
	
	
	
	
}
