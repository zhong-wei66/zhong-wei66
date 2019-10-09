package zw_java_study04;

public class TestObject {
	public static void main(String[] args) {
		
		TestObject to = new TestObject();
		System.out.println(to);//相当于System.out.println(to.toString());
			
	}
	
	//重写toString()方法
	public String toString() {
        return "测试object对象";
    }

}
