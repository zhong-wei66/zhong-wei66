package homeWork;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 第七章，编码题1
 * 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词;
 * 然后运行时从命令行输入一个单词，程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”
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
		
		//用户输入单词
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入一个单词");
		String word = scanner.nextLine();
		
		//判断数组中是否包含用户输入的单词
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
