package zw_java_study03;

/**
 * ���ǵ����µı�����1
 * �Ӽ�������ĳ��ʮ������������ת���ɶ�Ӧ�Ķ����������������
 * @author Administrator
 *
 */

import java.util.Scanner;
public class WorkDay03_Code01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ʮ����������");
		int x = sc.nextInt();
		System.out.println("�����ֵ�ǣ�"+x);
		//ת��Ϊ2����
		System.out.println(Integer.toBinaryString(x));
		
	}

}
