package zw_java_study04;
/**
 * 测试多态
 * @author Administrator
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		Animal a=new Animal();
		animalCry(a);
		
		Dog d=new Dog();//自动向上转型
		animalCry(d);
		animalCry(new Cat());
		
		Dog d2 = (Dog)d;//强制向下转型
		d2.seeDoor();
		
	}
	
	static void animalCry(Animal a) {
		a.shout();
		
	}

}


class Animal {
    public void shout() {
        System.out.println("叫了一声！");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("旺旺旺！");
    }
    public void seeDoor() {
        System.out.println("看门中....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵喵喵！");
    }
}
