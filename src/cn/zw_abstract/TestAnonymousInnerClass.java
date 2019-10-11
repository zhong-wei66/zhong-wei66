package cn.zw_abstract;
/**
 * 匿名内部类
 * @author Administrator
 *
 */
public class TestAnonymousInnerClass {
	public static void test01(AA b) {
		System.out.println("#########");
		b.aa();
	}
	public static void main(String[] args) {
		TestAnonymousInnerClass.test01(new AA() {
			@Override
			public void aa() {
				System.out.println("TestAnonymousInnerClass.main(...).new AA(){...}.aa()");
			}
		});
		
		//通过接口实现类new一个AA的对象
		AA testAA = new TestAA(18);
		//要调用test01方法，需要传一个AA类型的对象进去
		test01(testAA);
	}

}

//定义一个接口
interface AA{
	
	void aa();
}

//因为AA是接口，不能new对象，需要一个实现它的类
class TestAA implements AA  {
	int age;
	
	@Override
	public void aa() {
		System.out.println("执行了aa方法");	
	}
	
	public TestAA(int age) {
		this.age = age;
	}
}

