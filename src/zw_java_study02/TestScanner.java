package zw_java_study02;
import java.util.Scanner;
/**
 * 测试获得键盘输入
 * @author Administrator
 *
 */

public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String name = scanner.nextLine();//获得输入的名字
		System.out.println("清输入爱好：");
		String favor = scanner.nextLine();
		System.out.println("清输入年龄：");
		String age = scanner.nextLine();
		
		System.out.println("########################");
		System.out.println("名字："+name);
		System.out.println("爱好："+favor);
		System.out.println("年龄"+age);
		
	}
	

}
