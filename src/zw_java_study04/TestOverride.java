package zw_java_study04;

//import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ������д��Override��/����
 * @author Administrator
 *
 */

public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
		
	}

}

class Vehicle{
	public void run() {
		System.out.println("�ܡ�����������");
		
	}
	
	public void stop() {
		System.out.println("ͣ��");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class  Horse extends Vehicle{
	//��д����
	public void run() {
		System.out.println("��̤���࣬���ܰ��ܡ�����������");
			
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
	
}
