package cn.zw.collection;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/**
 * ����HashMap��ʹ��
 * @author Administrator
 *
 */

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> m1 = new HashMap<>();
		
		m1.put(1, "one");
		m1.put(2, "two");
		m1.put(3, "three");
		
		System.out.println(m1.get(1));
		System.out.println(m1.size());
		System.out.println(m1.containsKey(2));
		System.out.println(m1.containsValue("four"));
		
		Map<Integer, String> m2 = new HashMap<>();
//		m2.put(3, "��");
		m2.put(4, "��");
		m2.put(5, "��");
		
		m1.putAll(m2);//��m2�����еļ�ֵ�Դ�ŵ�m1
		System.out.println(m1);
		//map�м������ظ�,����ظ����µĸ��Ǿɵ�
		m1.put(3, "��");
		System.out.println(m1);
		
	}

}
