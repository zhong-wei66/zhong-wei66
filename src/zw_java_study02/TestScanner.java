package zw_java_study02;
import java.util.Scanner;
/**
 * ���Ի�ü�������
 * @author Administrator
 *
 */

public class TestScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������֣�");
		String name = scanner.nextLine();//������������
		System.out.println("�����밮�ã�");
		String favor = scanner.nextLine();
		System.out.println("���������䣺");
		String age = scanner.nextLine();
		
		System.out.println("########################");
		System.out.println("���֣�"+name);
		System.out.println("���ã�"+favor);
		System.out.println("����"+age);
		
	}
	

}
