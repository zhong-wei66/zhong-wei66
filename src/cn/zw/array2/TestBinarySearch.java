package cn.zw.array2;

import java.util.Arrays;

/**
 * ��ʾ��7-13�����ַ�����
 * @author Administrator
 *
 */

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] a = {1,2,323,23,543,12,59};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);//ʹ�ö��ַ����ң������ȶ������������;
		System.out.println(Arrays.toString(a));
		//����������µ�����λ��,��δ�ҵ����ظ�����
		System.out.println("��Ԫ�ص�������"+Arrays.binarySearch(a, 12));
		
	}
}
