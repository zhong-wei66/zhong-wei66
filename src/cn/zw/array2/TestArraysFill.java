package cn.zw.array2;

import java.util.Arrays;

/**
 * 【示例7-14】数组填充
 * @author Administrator
 *
 */
public class TestArraysFill {
	public static void main(String[] args) {
		int[] a = {1,2,323,23,543,12,59};
		System.out.println(Arrays.toString(a));
		Arrays.fill(a, 2,4,100);//将[2,4)索引的元素替换为100;
		System.out.println(Arrays.toString(a));
	}
}
