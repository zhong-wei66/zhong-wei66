package cn.zw.array2;

import java.util.Arrays;

/**
 * ��ʾ��7-14���������
 * @author Administrator
 *
 */
public class TestArraysFill {
	public static void main(String[] args) {
		int[] a = {1,2,323,23,543,12,59};
		System.out.println(Arrays.toString(a));
		Arrays.fill(a, 2,4,100);//��[2,4)������Ԫ���滻Ϊ100;
		System.out.println(Arrays.toString(a));
	}
}
