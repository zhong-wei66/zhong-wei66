package homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * �����£�������1
 * ������Ҳ���������һ������Ϊ10 ��һά�ַ������飬��ÿһ��Ԫ�ش��һ������;
 * Ȼ������ʱ������������һ�����ʣ������ж������Ƿ������������ʣ�����������ʾʹ�ӡ����Yes�����������ʹ�ӡ����No��
 * @author Administrator
 *
 */

public class day7_code01 {
	public static void main(String[] args) {
		String[] arr = null;
		arr = new String[10];
	
		for (int index = 0; index < 10; index++) {

			char a = 'a';
			char c = (char)(a+index);
			 String s = new String(new char[]{c});
			 arr[index] = s;		 
		}
		
		//�û����뵥��
		Scanner scanner = new Scanner(System.in);
		System.out.println("������һ������");
		String word = scanner.nextLine();
		
		//�ж��������Ƿ�����û�����ĵ���
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(word)) {
				result = 1;
				break;
			}
		}
		if (result==1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
