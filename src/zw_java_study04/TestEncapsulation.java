package zw_java_study04;
/**
 * ²âÊÔ·â×°
 * @author Administrator
 *
 */

public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
		//h.age = 13;
	}

}


class Human{
	private int age;
	String name;
	
	void sayAge() {
		System.out.println(age);
	}
	
}

class Boy extends Human{
	void sayHello() {
		//System.out.println(age);
	}
}