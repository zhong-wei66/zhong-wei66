package cn.zw_abstract;


public interface MyInterface {
	//���峣��
	/*public static final */int MAX_AGE=100;
	
	//���������
	/*public abstract */void test01();
	
}

class Myclass implements MyInterface{

	@Override
	public void test01() {
		System.out.println(MAX_AGE);
		System.out.println("Myclass.test01()");
		
	}
	
}

