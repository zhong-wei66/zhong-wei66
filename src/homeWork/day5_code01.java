package homeWork;
/**
 * �����£�������1
 * 1. ��дӦ�ó��򣬴�����Ķ��󣬷ֱ�����Բ�İ뾶��Բ����ĸߣ�
 * ���㲢�ֱ���ʾԲ�뾶��Բ�����Բ�ܳ���Բ����������
 * ʵ��˼·���ؼ����룺
 * 1) ��дһ��Բ��Circle������ӵ�У�
 * a) һ����Ա������radius(˽�У�������);//���Բ�İ뾶
 * b) �������췽��(�޲Ρ��в�);
 * c) ������Ա����
 * double getArea() //��ȡԲ�����
 * double getPerimeter() //��ȡԲ���ܳ�
 * void show() //��Բ�Ĺؾ����ܳ�������������Ļ
 * 2) ��дһ��Բ������Cylinder�����̳��������Circle�ࡣ��ӵ�У�
 * a) һ����Ա������double hight (˽�У�������); //Բ����ĸ�;
 * b) ���췽��
 * c) ��Ա����
 * double getVolume() //��ȡԲ��������
 * void showVolume() //��Բ���������������Ļ
 *
 */

public class day5_code01 {
	
	public static void main(String[] args) {
		Circle yuan=new Circle(2);
		yuan.show();
		Cylinder cy=new Cylinder(2,3);//2�ǰ뾶��3�Ǹ�
		//cy.getVolume();
		System.out.println(cy.getVolume());
		
		
	}
	
}	

class Circle{//Բ
	/*private */double radius;//�뾶
	//�޲ι��췽��
	Circle(){
		//System.out.println("û�а뾶");
	}
	//�в����Ĺ��췽��
	Circle(double radius){
		this.radius=radius;
	}
		
	//��Ա����1����ȡԲ�����
	public double getArea() {
		double s;
		s=Math.PI*Math.pow(radius, 2);
		return s;
		}
		
	//��Ա����2����ȡԲ���ܳ�
	public double getPerimeter() {
		double c;
		c=2*Math.PI*radius;
		return c;
		  
		 }
		
	//��Ա����3����Բ�İ뾶���ܳ�������������Ļ
	public void show() {
		System.out.println("Բ�İ뾶:"+radius);
		System.out.println("Բ�����:"+getArea());
		System.out.println("Բ���ܳ�:"+getPerimeter());
	}
		
}
	
	
class Cylinder extends Circle{//Բ������
	double height;//Բ����ĸ�
		
	Cylinder(double radius,double height) {
		this.height=height;
		this.radius=radius;
	}
	
	double getVolume() {//��ȡԲ��������
		double V;
		V=this.getArea()*height;
		return V;	
	}
	 void showVolume() {//��Բ���������������Ļ
		 System.out.println("Բ��������:"+getVolume());
			 
		 }
}
		
	
	





