package homeWork;
/**
 * �����±�����2
 *  дһ������void isTriangle(int a,int b,int c)��
 *  �ж����������Ƿ��ܹ���һ�������Σ�
 *   ����������׳��쳣IllegalArgumentException��
 *   ��ʾ�쳣��Ϣ ��a,b,c���ܹ��������Ρ���
 *   ������Թ�������ʾ�����������߳������������еõ���������������������� 
 *   ���ô˷������������쳣��
 * @author Administrator
 *
 */

class  IllegalArgumentException extends Exception{
	public IllegalArgumentException() {
		
	}
	
	public IllegalArgumentException(String message) {
		super(message);
	}
	
}

class Triangle{//����һ����������
	public void isTriangle(int a,int b,int c) throws IllegalArgumentException{
		if (a+b>c && Math.abs(a-b)<c) {
			System.out.println("�������Σ������߷ֱ��ǣ�"+a+", "+b+", "+c);
		}else {
			throw new IllegalArgumentException(a+", "+b+", "+c+"���ܹ���������");
		}
		
	}
}


public class day6_code02 {
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		try {
			tr.isTriangle(3, 4, 50);
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		
	}

}
