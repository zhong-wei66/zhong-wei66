package homeWork;
/**
 *这里是第四章编码题1
 * 1. 编写 Java 程序
 * 用于显示人的姓名和年龄。定义一个人类Person。
 *  该类中应该有两个私有属性： 姓名 (name) 和年龄 (age) 。
 *  定义构造方法用来初始化数据成员。再定义显示(display()) 方法将姓名和年龄打印出来。
 *  在 main 方法中创建人类的实例然后将信息显示。

 * @author Administrator
 *
 */

public class day4_code01{
	//定义私有属性
	private String name;
	private int age;
	
	//定义构造方法
	public day4_code01(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		day4_code01 person=new day4_code01("张三",5);
		person.display();
	}
}

