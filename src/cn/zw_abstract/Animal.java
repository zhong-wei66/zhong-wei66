package cn.zw_abstract;
/**
 * 抽象类abstract
 * 抽象类的意义在于：为子类提供统一的/规范的模板。子类必须实现相关的抽象方法
 * @author Administrator
 *
 */

public abstract class Animal {
	
	//第一：父类没有实现。第二：子类必须实现。
	abstract public void shout();
	
	public void run() {
		System.out.println("跑跑跑！");
	}
	
	public static void main(String[] args) {
//		不能用new来实例化抽象类，但是可以实例化抽象类的子类
//		Animal a = new Animal();会报错
		Animal a = new Dog();
	}

}

class Dog extends Animal{

	@Override
	public void shout() {
		System.out.println("汪汪汪！");
		
	}
	
}
