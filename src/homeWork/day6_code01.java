package homeWork;
/**
 * 第六章编码题1
 * 1. 编写程序接收用户输入分数信息，
 * 如果分数在0—100之间，输出成绩。
 * 如果成绩不在该范围内，抛出异常信息，提示分数必须在0—100之间。
 * 要求：使用自定义异常实现。
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


class Grade {
	private int grade;
	
	public void setGrade(int grade) throws IllegalGrade {
		if (grade<0 || grade> 100) {
			throw new IllegalGrade("分数不合法"+grade);
		}

		System.out.println("分数是："+grade);
	}
	
}


public class day6_code01 {
	public static void main(String[] args) {
		
		Grade grade = new Grade();
		try {
			grade.setGrade(40);
		} catch (IllegalGrade e) {
			e.printStackTrace();
		}
	}

}
