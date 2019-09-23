package zw_java_study04;


/**
 * 测试继承
 * @author 钟微
 *
 */

public class TextExtends {
	public static void main(String[] args) {
		Students1 stus1 = new Students1();
		stus1.name = "zhong_wei";
		stus1.height = 163;
		stus1.rest();
		
	}

}

class Person{
	String name;
	int height;
	public void rest() {
	System.out.println("休息一会儿！");
	}
}
	

class Students1 extends Person{
	String major;
	public void study() {
		System.out.println("学习两小时");
	}
	public Students1() {
		// TODO Auto-generated constructor stub
	}
}