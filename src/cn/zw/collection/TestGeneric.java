package cn.zw.collection;

import java.awt.List;
import java.util.Map;


/**
 * �����������
 * ���Է���
 * @author Administrator
 *
 */

//���ʹ���
public class TestGeneric {
	public static void main(String[] args) {
		MyCollection<String> mc = new MyCollection<String>();
		mc.set("��΢", 1);
		String b = mc.get(1);
		System.out.println(b);
		
		List list;
		Map map;
		
	}
	
}

class MyCollection<E>{
	Object[] objs = new Object[5];
	
	public void set(E e,int index) {
		objs[index] = e;
	}
	
	public E get(int index) {
		return (E)objs[index];
	}
}





//�޷��ʹ���

//public class TestGeneric {
//	public static void main(String[] args) {
//		MyCollection mc = new MyCollection();
//		mc.set("��΢",0);
//		mc.set(8888,1);
//		//Integer a = (Integer)mc.get(1); //ǿת����
//		int a = (int)mc.get(1);
//		System.out.println(a);
//		String b = (String)mc.get(0);
//		System.out.println(b);
//		
//	}
//
//}
//
//
//class MyCollection{//����
//	Object[] objs = new Object[5];
//	
//	public void set(Object obj,int index) {
//		objs[index] = obj;
//	}
//	
//	public Object get(int index) {
//		return objs[index];
//	}
//	
//	
//	
//}