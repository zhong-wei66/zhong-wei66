package cn.zw_abstract;
/**
 * �����ڲ���
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
		
		//ͨ���ӿ�ʵ����newһ��AA�Ķ���
		AA testAA = new TestAA(18);
		//Ҫ����test01��������Ҫ��һ��AA���͵Ķ����ȥ
		test01(testAA);
	}

}

//����һ���ӿ�
interface AA{
	
	void aa();
}

//��ΪAA�ǽӿڣ�����new������Ҫһ��ʵ��������
class TestAA implements AA  {
	int age;
	
	@Override
	public void aa() {
		System.out.println("ִ����aa����");	
	}
	
	public TestAA(int age) {
		this.age = age;
	}
}

