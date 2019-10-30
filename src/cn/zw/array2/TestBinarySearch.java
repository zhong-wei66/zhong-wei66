package cn.zw.array2;

import java.util.Arrays;

/**
 * 【示例7-13】二分法查找
 * @author Administrator
 *
 */

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = {1,2,323,23,543,12,59};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//使用二分法查找，必须先对数组进行排序;
		System.out.println(Arrays.toString(a));
		//返回排序后新的索引位置,若未找到返回负数。
		System.out.println("该元素的索引："+Arrays.binarySearch(a, 12));
		
	}
}
