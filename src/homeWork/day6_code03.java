package homeWork;

import java.util.Scanner;

/**
 * �����±�����3
 * ��дһ������N��ѧ������ƽ���ֵĳ���
 * ����Ӧ����ʾ�û�����N��ֵ�� ��α�����������N��ѧ��������
 * ����û�����ķ�����һ����������Ӧ���׳�һ���쳣������
 * ��ʾ��������������������0��������ʾ�û��ٴ�����÷���
 * 
 * @author Administrator
 *
 */
class IllegalGrade extends Exception{
	
	public IllegalGrade() {
			
		}

	public IllegalGrade(String message) {
		super(message);
	}
	
}


class testScanner{
	
	public void test() throws IllegalGrade {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ������");
		String stu_num = scanner.nextLine();
		//Double.parseDouble(s)��string����ǿתΪdouble����
		double num = Double.parseDouble(stu_num); 
		
		if (num<0) {
			throw new IllegalGrade("�����������0");
		}
		
		System.out.println("������ѧ���������á�,������");
		String stu_grade = scanner.nextLine();
		
		String[] grade = stu_grade.split(",");
		double sum = 0;
		for (int i = 0; i < grade.length; i++) {
//			System.out.println("fens:"+grade[i]);
			sum = sum + Double.parseDouble(grade[i]);
//			System.out.println("sum:"+sum);
		}
		
		double avg = sum/num;
		System.out.println("ƽ�����ǣ�"+avg);
		
	}
}



public class day6_code03 {
	public static void main(String[] args) {
		
		testScanner ts = new testScanner();
		
		try {
			ts.test();
		} catch (IllegalGrade e) {

			e.printStackTrace();
		}
	
	}

}
