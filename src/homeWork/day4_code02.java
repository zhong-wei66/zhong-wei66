package homeWork;

/**
 * �����ǵ����±�����2
* ����һ��Բ�ࡪ��Circle��������ڲ��ṩһ�����ԣ��뾶(r)��
*ͬʱ �ṩ ���� �� �� �� ���� ��� ( getArea() ) �� ���� �ܳ�(getPerimeter()) �� 
*ͨ��������������Բ���ܳ���������ҶԼ��������������
*�����һ��������� Circle �����ʹ�á�
 * @author Administrator
 *
 */
public class day4_code02 {
	double r;
	//�������
	public void getArea() {
		double area=Math.PI*r*r;
		System.out.println(area);
	}
	
	//�����ܳ�
	public void getPerimeter() {
		double perimeter=2*Math.PI*r;
		System.out.println(perimeter);
	}
	
	//���췽��
	public day4_code02(double r) {
		this.r=r;
	}
	
	public static void main(String[] args) {
		day4_code02 Circle=new day4_code02(1);
		Circle.getArea();
		Circle.getPerimeter();
		
	}
		
	

}
