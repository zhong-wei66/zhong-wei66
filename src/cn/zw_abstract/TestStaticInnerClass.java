package cn.zw_abstract;

/**
 * 静态内部类
 * @author Administrator
 *
 */
public class TestStaticInnerClass {
	public static void main(String[] args) {
		//创建静态内部类对象
		Outer2.Inner2 inner2=new Outer2.Inner2();
		
	}

}

class Outer2{
	
	//定义一个静态内部类
	static class Inner2{
		
	}
	
}

