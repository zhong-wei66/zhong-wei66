package zw_java_study04;


/**
 * 测试继承
 * @author 钟微
 *
 */

public class TextExtends {
	public static void main(String[] args) {
		Students stus = new Students();
		stus.name = "zhong_wei";
		stus.height = 163;
		stus.rest();
		
		Students stus2 = new Students("西西", 163, "计算机");
		//instanceof 判断左边的类型是不是右边的继承
		System.out.println(stus2 instanceof Students);
		
		
	}

}

class Person{
	String name;
	int height;
	public void rest() {
	System.out.println("休息一会儿！");
	}
}
	
//extends 继承，此处是Students 继承 Person
class Students extends Person{
	
	String major;
	public void study() {
		System.out.println("学习两小时");
	}
	
	//定义一个构造器
	public Students(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
		
	}
	
	public Students() {
		
	}
	
}