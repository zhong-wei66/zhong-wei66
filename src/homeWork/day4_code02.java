package homeWork;

/**
 * 这里是第四章编码题2
* 定义一个圆类——Circle，在类的内部提供一个属性：半径(r)，
*同时 提供 两个 方 法 ： 计算 面积 ( getArea() ) 和 计算 周长(getPerimeter()) 。 
*通过两个方法计算圆的周长和面积并且对计算结果进行输出。
*最后定义一个测试类对 Circle 类进行使用。
 * @author Administrator
 *
 */
public class day4_code02 {
	double r;
	//计算面积
	public void getArea() {
		double area=Math.PI*r*r;
		System.out.println(area);
	}
	
	//计算周长
	public void getPerimeter() {
		double perimeter=2*Math.PI*r;
		System.out.println(perimeter);
	}
	
	//构造方法
	public day4_code02(double r) {
		this.r=r;
	}
	
	public static void main(String[] args) {
		day4_code02 Circle=new day4_code02(1);
		Circle.getArea();
		Circle.getPerimeter();
		
	}
		
	

}
