package cn.zw.collection;
import java.util.*;

/**
 * 测试collection接口中的方法
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
		System.out.println(c.size());//返回有多少个元素
		System.out.println(c.isEmpty());//是否为空
		
		c.add("高老大");
		c.add("高老二");
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println("############");
		System.out.println(c.contains("高老二"));//是否包含
		
		Object[] objs = c.toArray();//转化为数组
		System.out.println(objs);
		
		c.remove("高老二");//移除，移除后只是删掉c中对“高老二”对象的引用地址，不是删除“高老二”这个对象
		System.out.println(c);
		
		c.clear();//移除所有的元素
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
//		list01.removeAll(list02);//去掉相同的
		list01.retainAll(list02);//去相同的
		System.out.println("list01:"+list01);
		
		System.out.println(list01.containsAll(list02));//list01中是否包含list02中所有的元素
	}

	public static void test03() {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		list.add(2, "钟微");//指定索引插入新的元素，后面的元素向后移
		System.out.println(list);
		
		list.remove(2);//删除索引2
		System.out.println(list);
		
		list.set(2, "钟微");//把索引为2的值改为“钟微”
		System.out.println(list);
		
//		System.out.println(list.get(2));//返回索引为2的值
//		
//		System.out.println(list.indexOf("钟微"));//返回元素“钟微”的第一次出现的索引，没有该元素返回-1
		
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println(list);
		System.out.println(list.indexOf("B"));//返回元素“B”的第一次出现的索引，没有该元素返回-1
		System.out.println(list.lastIndexOf("B"));//返回元素“B”的最后一次出现的索引，没有该元素返回-1
		
		
	}
	
	
}
