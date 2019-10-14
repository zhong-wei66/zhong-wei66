package homeWork;

import java.util.Scanner;

/**
 * 3.某个公司采用公用电话传递数据，
 * 数据是四位的整数，在传递过程中是加密的，
 * 加密规则如下：每位数字都加上5,然后用和除以10的余数代替该数字，
 * 再将第一位和第四位交换，
 * 第二位和第三位交换。
 * 输入数字：1357
 * 加密后的数字：2086
 * @author Administrator
 *
 */

public class day2_code03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入一个四位数：");
		String num=scanner.nextLine();//获取输入的字符
		
		
		int num1=Integer.parseInt(num);
//		int num1=1357;
		int units=num1%10;//个位数
//		System.out.println(units);
		int tens=(num1%100)/10;//十位
//		System.out.println(tens);
		int hundreds=(num1%1000)/100;//百位
//		System.out.println(hundreds);
		int thousands=num1/1000;//千位
//		System.out.println(thousands);
		//每位数字都加上5, 然后用和除以10的余数代替该数字
		int units1=(units+5)%10;
		int tens1=(tens+5)%10;
		int hundreds1=(hundreds+5)%10;
		int thousands1=(thousands+5)%10;
		
		int i;
		i=units1;
		units1=thousands1;
		thousands1=i;
		
		i=tens1;
		tens1=hundreds1;
		hundreds1=i;
		
		int result=units1+tens1*10+hundreds1*100+thousands1*1000;
		System.out.println(result);
	
		
	}

}
