package homeWork;
/**
 * �����±�����1
 * 1. ��д��������û����������Ϣ��
 * ���������0��100֮�䣬����ɼ���
 * ����ɼ����ڸ÷�Χ�ڣ��׳��쳣��Ϣ����ʾ����������0��100֮�䡣
 * Ҫ��ʹ���Զ����쳣ʵ�֡�
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
			throw new IllegalGrade("�������Ϸ�"+grade);
		}

		System.out.println("�����ǣ�"+grade);
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
