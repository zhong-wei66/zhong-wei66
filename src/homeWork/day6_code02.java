package homeWork;
/**
 * 第六章编码题2
 *  写一个方法void isTriangle(int a,int b,int c)，
 *  判断三个参数是否能构成一个三角形，
 *   如果不能则抛出异常IllegalArgumentException，
 *   显示异常信息 “a,b,c不能构成三角形”，
 *   如果可以构成则显示三角形三个边长，在主方法中得到命令行输入的三个整数， 
 *   调用此方法，并捕获异常。
 * @author Administrator
 *
 */

class  IllegalArgumentException extends Exception{
	public IllegalArgumentException() {
		
	}
	
	public IllegalArgumentException(String message) {
		super(message);
	}
	
}

class Triangle{//定义一个三角形类
	public void isTriangle(int a,int b,int c) throws IllegalArgumentException{
		if (a+b>c && Math.abs(a-b)<c) {
			System.out.println("是三角形，三条边分别是："+a+", "+b+", "+c);
		}else {
			throw new IllegalArgumentException(a+", "+b+", "+c+"不能构成三角形");
		}
		
	}
}


public class day6_code02 {
	public static void main(String[] args) {
		Triangle tr = new Triangle();
		try {
			tr.isTriangle(3, 4, 50);
			
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		
		
	}

}
