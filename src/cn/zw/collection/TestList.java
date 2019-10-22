package cn.zw.collection;
import java.util.*;

/**
 * ����collection�ӿ��еķ���
 * @author Administrator
 *
 */
public class TestList {
	public static void main(String[] args) {
//		test02();
		test03();
	}
	public static void test01() {
		Collection<String> c = new ArrayList<>();
		System.out.println(c.size());//�����ж��ٸ�Ԫ��
		System.out.println(c.isEmpty());//�Ƿ�Ϊ��
		
		c.add("���ϴ�");
		c.add("���϶�");
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println("############");
		System.out.println(c.contains("���϶�"));//�Ƿ����
		
		Object[] objs = c.toArray();//ת��Ϊ����
		System.out.println(objs);
		
		c.remove("���϶�");//�Ƴ����Ƴ���ֻ��ɾ��c�жԡ����϶�����������õ�ַ������ɾ�������϶����������
		System.out.println(c);
		
		c.clear();//�Ƴ����е�Ԫ��
		System.out.println(c.size());
		
	}
	
	
	public static void test02() {
		
		List<String> list01 = new ArrayList<String>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<String>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
		
//		list01.addAll(list02);
//		list01.removeAll(list02);//ȥ����ͬ��
		list01.retainAll(list02);//ȥ��ͬ��
		System.out.println("list01:"+list01);
		
		System.out.println(list01.containsAll(list02));//list01���Ƿ����list02�����е�Ԫ��
	}

	public static void test03() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		list.add(2, "��΢");//ָ�����������µ�Ԫ�أ������Ԫ�������
		System.out.println(list);
		
		list.remove(2);//ɾ������2
		System.out.println(list);
		
		list.set(2, "��΢");//������Ϊ2��ֵ��Ϊ����΢��
		System.out.println(list);
		
//		System.out.println(list.get(2));//��������Ϊ2��ֵ
//		
//		System.out.println(list.indexOf("��΢"));//����Ԫ�ء���΢���ĵ�һ�γ��ֵ�������û�и�Ԫ�ط���-1
		
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println(list);
		System.out.println(list.indexOf("B"));//����Ԫ�ء�B���ĵ�һ�γ��ֵ�������û�и�Ԫ�ط���-1
		System.out.println(list.lastIndexOf("B"));//����Ԫ�ء�B�������һ�γ��ֵ�������û�и�Ԫ�ط���-1
		
		
	}
	
	
}
