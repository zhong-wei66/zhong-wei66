package cn.zw.collection;

import java.util.HashSet;
import java.util.Set;

/**
 * ����TestHashSet�Ļ����÷�
 * set:û��˳�򣬲����ظ�
 * list:��˳�򣬿��ظ�
 * @author Administrator
 *
 */
public class TestHashSet {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("aa");
		set1.add("bb");
		set1.add("aa");//�����ظ����
		System.out.println(set1);
		set1.remove("bb");
		System.out.println(set1);
		
		
		Set<String> set2 = new HashSet<String>();
		set2.add("zhongwei");
		set2.addAll(set1);
		System.out.println(set2);
		
		
	}
}
