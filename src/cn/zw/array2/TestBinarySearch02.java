package cn.zw.array2;

import java.util.Arrays;

/**
 * ��ʾ��7-7-22�����ַ�����
 * @author Administrator
 *
 */

public class TestBinarySearch02 {
	public static void main(String[] args) {
		
		int[] arr = {30,20,50,10,80,9,7,12,100,40,8};
		int searchWord =10;//����Ҫ���ҵ���
		Arrays.sort(arr);//���ֲ���֮ǰ�������������
		System.out.println(Arrays.toString(arr));
//		�����[7, 8, 9, 10, 12, 20, 30, 40, 50, 80, 100]
		System.out.println(searchWord+"Ԫ�ص�������"+sWord(arr,searchWord));
	}
		
	public static int sWord(int[] arr, int searchWord) {
		int high = arr.length-1;
		int low = 0;
				
		while (low<=high) {
			int midiel = (high+low)/2;
				
			if (arr[midiel] == searchWord) {
				return midiel;//���ز��ҵ�����
			}else if (arr[midiel] > searchWord) {
				high = midiel-1;	
			}else if (arr[midiel] < searchWord) {
				low = midiel+1;
			}		
					
		}
		return -1;//���û�ҵ�����-1
	}	
		
		
		
}
