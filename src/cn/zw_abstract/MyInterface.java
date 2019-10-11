package cn.zw_abstract;


public interface MyInterface {
	//定义常量
	/*public static final */int MAX_AGE=100;
	
	//定义抽象类
	/*public abstract */void test01();
	
}

class Myclass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(MAX_AGE);
		System.out.println("Myclass.test01()");
		
	}
	
}

