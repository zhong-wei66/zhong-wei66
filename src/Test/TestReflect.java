package Test;

import java.lang.reflect.InvocationTargetException;

public class TestReflect {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

		Class clz = Class.forName("Test.Iphone");
		Iphone iphone = (Iphone)clz.getConstructor().newInstance();
		System.out.println(iphone);

	}

}

class Iphone{
	public Iphone() {
		
	}
}
