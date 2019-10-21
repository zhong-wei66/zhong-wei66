package homeWork;
/**
 * 第五章：编码题1
 * 1. 编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，
 * 计算并分别显示圆半径、圆面积、圆周长，圆柱体的体积。
 * 实现思路及关键代码：
 * 1) 编写一个圆类Circle，该类拥有：
 * a) 一个成员变量，radius(私有，浮点型);//存放圆的半径
 * b) 两个构造方法(无参、有参);
 * c) 三个成员方法
 * double getArea() //获取圆的面积
 * double getPerimeter() //获取圆的周长
 * void show() //将圆的关径、周长、面积输出到屏幕
 * 2) 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
 * a) 一个成员变量，double hight (私有，浮点型); //圆柱体的高;
 * b) 构造方法
 * c) 成员方法
 * double getVolume() //获取圆柱体的体积
 * void showVolume() //将圆柱体的体积输出到屏幕
 *
 */

public class day5_code01 {
	
	public static void main(String[] args) {
		Circle yuan=new Circle(2);
		yuan.show();
		Cylinder cy=new Cylinder(2,3);//2是半径，3是高
		//cy.getVolume();
		System.out.println(cy.getVolume());
		
		
	}
	
}	

class Circle{//圆
	/*private */double radius;//半径
	//无参构造方法
	Circle(){
		//System.out.println("没有半径");
	}
	//有参数的构造方法
	Circle(double radius){
		this.radius=radius;
	}
		
	//成员方法1：获取圆的面积
	public double getArea() {
		double s;
		s=Math.PI*Math.pow(radius, 2);
		return s;
		}
		
	//成员方法2：获取圆的周长
	public double getPerimeter() {
		double c;
		c=2*Math.PI*radius;
		return c;
		  
		 }
		
	//成员方法3：将圆的半径、周长、面积输出到屏幕
	public void show() {
		System.out.println("圆的半径:"+radius);
		System.out.println("圆的面积:"+getArea());
		System.out.println("圆的周长:"+getPerimeter());
	}
		
}
	
	
class Cylinder extends Circle{//圆柱体类
	double height;//圆柱体的高
		
	Cylinder(double radius,double height) {
		this.height=height;
		this.radius=radius;
	}
	
	double getVolume() {//获取圆柱体的体积
		double V;
		V=this.getArea()*height;
		return V;	
	}
	 void showVolume() {//将圆柱体的体积输出到屏幕
		 System.out.println("圆柱体的体积:"+getVolume());
			 
		 }
}
		
	
	





