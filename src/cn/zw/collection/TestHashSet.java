package cn.zw.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * 测试TestHashSet的基本用法
 * set:没有顺序，不可重复
 * list:有顺序，可重复
 * @author Administrator
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");//不可重复添加
		System.out.println(set1);
		set1.remove("bb");
		System.out.println(set1);
		
		
		Set<String> set2 = new HashSet<String>();
		set2.add("zhongwei");
		set2.addAll(set1);
		System.out.println(set2);
		
		
	}
}
