package zw_java_study03;

/**
 * 测试：方法的基本使用
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		//通过对象调用普通方法
		TestMethod tm = new TestMethod();
		tm.printSXT();
		//tm.add(30, 40, 50);
		int c = tm.add(30, 40, 50)+1000;
		System.out.println(c);
		
	}
	
	void printSXT() {
		System.out.println("北京尚学堂");
		System.out.println("上海尚学堂");
		System.out.println("广州尚学堂");
		
	}

	
	int add(int a,int b,int c) { //有返回值这里就不能是void，要是返回值对应的类型
		int sum = a+b+c;
		System.out.println(sum);
		return sum; //return 两个作用：结束方法的运行、返回值
	}
	

}
