package cn.zw.array2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * java.util.Arrays�������ʹ��
 * @author Administrator
 *
 */

public class TestArrays {
	public static void main(String[] args) {
		int[] a= {100,20,30,5,150,80,99};
		System.out.println(a);
		System.out.println(Arrays.toString(a));//Arrays�ṩtoString(a)���������ڴ�ӡ�����е�Ԫ��
		Arrays.sort(a);//����
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 30));//��������a���Ƿ���30���Ԫ�أ��з���Ԫ��30��Ӧ��������û�з���-1
	}

}
