package homeWork;

import java.util.Scanner;

/**
 * 第六章编码题3
 * 编写一个计算N个学生分数平均分的程序。
 * 程序应该提示用户输入N的值， 如何必须输入所有N个学生分数。
 * 如果用户输入的分数是一个负数，则应该抛出一个异常并捕获，
 * 提示“分数必须是正数或者0”。并提示用户再次输入该分数
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
		System.out.println("请输入学生人数");
		String stu_num = scanner.nextLine();
		//Double.parseDouble(s)把string类型强转为double类型
		double num = Double.parseDouble(stu_num); 
		
		if (num<0) {
			throw new IllegalGrade("人数必须大于0");
		}
		
		System.out.println("请输入学生分数，用“,”隔开");
		String stu_grade = scanner.nextLine();
		
		String[] grade = stu_grade.split(",");
		double sum = 0;
		for (int i = 0; i < grade.length; i++) {
//			System.out.println("fens:"+grade[i]);
			sum = sum + Double.parseDouble(grade[i]);
//			System.out.println("sum:"+sum);
		}
		
		double avg = sum/num;
		System.out.println("平均分是："+avg);
		
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
