package cn.zw.array2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * java.util.Arrays工具类的使用
 * @author Administrator
 *
 */

public class TestArrays {
	public static void main(String[] args) {
		int[] a= {100,20,30,5,150,80,99};
		System.out.println(a);
		System.out.println(Arrays.toString(a));//Arrays提供toString(a)方法，用于打印数组中的元素
		Arrays.sort(a);//排序
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 30));//搜索数组a中是否含有30这个元素，有返回元素30对应的索引，没有返回-1
	}

}
