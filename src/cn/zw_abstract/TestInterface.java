package cn.zw_abstract;
/**
 * 测试接口和实现类
 * @author Administrator
 *
 */

public class TestInterface {
	public static void main(String[] args) {
		Voland voland = new Angel();
		voland.fly();
		
	}

}

/**
 * 飞行接口
 * 
 */

interface Voland{
	//定义常量，完整写法为：public static final int FLY_HEIGHT = 1000;
	int FLY_HEIGHT = 1000;
	//定义抽象类，完整写法为：public abstract void fly();
	void fly();
}

//善良类

interface Honest{
	void helpOther();
}

//实现接口

class Angel implements Voland,Honest{//实现类可以实现多个父类接口

	@Override
	public void helpOther() {
		System.out.println("帮助类：扶老奶奶过马路");
		
	}

	@Override
	public void fly() {
		System.out.println("我是天使，飞起来啦！");
		
	}
	
}




