package cn.zw.io;
/**
 * 【示例10-15】装饰器模式演示
 * @author Administrator
 *
 */

class Iphone {
	private String name;

	public Iphone(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("我是："+ name + "，可以在屏幕显示");
	}
}

class TouyingPhone {
	public Iphone phone;

	public TouyingPhone(Iphone p) {
		super();
		this.phone = p;
	}
	//功能更强的方法
	public void show() {
		phone.show();
		System.out.println("我还可以投影到墙壁上显示");
	}
	
	
}
public class TestDecoration {
	public static void main(String[] args) {
		Iphone phone = new Iphone("iphone30");
		phone.show();
		System.out.println("-------------");
		TouyingPhone tyPhone = new TouyingPhone(phone);
		tyPhone.show();
	}
}
