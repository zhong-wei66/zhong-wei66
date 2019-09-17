package zw_java_study02;
/**
 * 位运算符
 * @author Administrator
 *
 */
public class TestOperator04 {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println(~b);
		
		//移位
		int c=3<<2;//相当于3*2*2
		int d=4<<3;//相当于4*2*2*2
		int e=12>>2;//相当于/2/2
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
				
	}

}
