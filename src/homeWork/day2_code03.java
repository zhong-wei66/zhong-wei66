package homeWork;

import java.util.Scanner;

/**
 * 3.ĳ����˾���ù��õ绰�������ݣ�
 * ��������λ���������ڴ��ݹ������Ǽ��ܵģ�
 * ���ܹ������£�ÿλ���ֶ�����5,Ȼ���úͳ���10��������������֣�
 * �ٽ���һλ�͵���λ������
 * �ڶ�λ�͵���λ������
 * �������֣�1357
 * ���ܺ�����֣�2086
 * @author Administrator
 *
 */

public class day2_code03 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ����λ����");
		String num=scanner.nextLine();//��ȡ������ַ�
		
		
		int num1=Integer.parseInt(num);
//		int num1=1357;
		int units=num1%10;//��λ��
//		System.out.println(units);
		int tens=(num1%100)/10;//ʮλ
//		System.out.println(tens);
		int hundreds=(num1%1000)/100;//��λ
//		System.out.println(hundreds);
		int thousands=num1/1000;//ǧλ
//		System.out.println(thousands);
		//ÿλ���ֶ�����5, Ȼ���úͳ���10���������������
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
