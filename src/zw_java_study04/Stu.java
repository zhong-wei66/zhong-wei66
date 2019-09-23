package zw_java_study04;

public class Stu {
	//属性fields
	int id;
	String sname;
	int age;
	
	Computer comp;//计算机
	
	//方法
	void study(){
		System.out.println("哈哈哈！，使用的电脑是："+comp.brand);
	}
	
	void play(){
		System.out.println("王者荣耀");
	}
	
	//构造方法，用于创建这个类的对象。无参的构造方法可由系统自动构造
	//方法名必须和类名保持一致
	Stu(){
		
	}
	
	//main方法是程序执行的入口，必须要有
	public static void main(String[] args) {
		Stu stu = new Stu();//new创建一个对象
		System.out.println("stu的地址："+stu);
		stu.id=1001;
		stu.sname="钟微";
		stu.age=18;
		
		Computer c1=new Computer();
		c1.brand="联想";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
			
	}

}

class Computer{
	String brand;//brand品牌
	
}
