package cn.zw.array2;

import java.util.Arrays;

/**
 * 【示例7-7-22】二分法查找
 * @author Administrator
 *
 */

public class TestBinarySearch02 {
	public static void main(String[] args) {
		
		int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
		int searchWord =10;//定义要查找的数
		Arrays.sort(arr);//二分查找之前，需对数组排序
		System.out.println(Arrays.toString(arr));
//		排序后[7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100]
		System.out.println(searchWord+"元素的索引："+sWord(arr,searchWord));
	}
		
	public static int sWord(int[] arr, int searchWord) {
		int high = arr.length-1;
		int low = 0;
				
		while (low<=high) {
			int midiel = (high+low)/2;
				
			if (arr[midiel] == searchWord) {
				return midiel;//返回查找的索引
			}else if (arr[midiel] > searchWord) {
				high = midiel-1;	
			}else if (arr[midiel] < searchWord) {
				low = midiel+1;
			}		
					
		}
		return -1;//如果没找到返回-1
	}	
		
		
		
}
