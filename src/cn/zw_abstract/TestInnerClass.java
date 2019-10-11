package cn.zw_abstract;
/**
 * 非静态内部类
 * @author Administrator
 *
 */

public class TestInnerClass {
	public static void main(String[] args) {
		//创建内部类对象，要创建内部类对象先要创建外部类对象
		Outer.Inner inner= new Outer().new Inner();
		//调内部类的方法
		inner.show();
		
	}

}

class Outer{
	private int age=10;
	
	public void testOuter() {
		System.out.println("Outer.testOuter()");
	}
	//定义一个非静态内部类	
	class Inner{
		//普通内部类中不能加static方法和static属性
		int age=20;
		public void show() {
			int age=30;
			System.out.println("外部类的成员变量age："+Outer.this.age);
			System.out.println("内部类的成员变量age："+this.age);
			System.out.println("局部变量age："+age);
			
		}
	}
	
	
}
