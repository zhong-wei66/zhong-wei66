package cn.zw.wrapped;
/**
 * 自动装箱、自动拆箱
 * @author Administrator
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		Integer a=234;//自动装箱，编译器会修改为：Integer a=integer.valueOf(234)
		
		int b=a;//自动拆箱，编译器会修改为：int b=a.intValue()
		
		Integer c=null;
		int d=c;
	}

}
