package zw_java_study04;

//import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * ≤‚ ‘÷ÿ–¥£®Override£©/∏≤∏«
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
		System.out.println("≈‹°£°£°£°£°£°£");
		
	}
	
	public void stop() {
		System.out.println("Õ££°");
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
}

class  Horse extends Vehicle{
	//÷ÿ–¥∑Ω∑®
	public void run() {
		System.out.println("¬ÌÃ§∑…—‡£¨≈‹≈‹∞°≈‹°£°£°£°£°£°£");
			
	}
	
	public Person whoIsPsg() {
		return new Person();
	}
	
}
