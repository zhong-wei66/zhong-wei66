package zw_java_study03;

/**
 * 这是第三章的编码题1
 * 从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
 * @author Administrator
 *
 */

import java.util.Scanner;
public class WorkDay03_Code01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个十进制整数：");
		int x = sc.nextInt();
		System.out.println("输入的值是："+x);
		//转换为2进制
		System.out.println(Integer.toBinaryString(x));
		
	}

}
