package homeWork;
/**
 * 这是第三章的编码题2
 * 编程求：∑1+∑2+……+∑100
 * @author Administrator
 *
 */
public class Day3_Code02 {
	public static void main(String[] args) {
		//定义一个result用于接收∑1+∑2+……+∑100的结果
		int result=0;
		for (int i = 1; i <=100; i++) {
			//定义一个sum用于接收∑j的值
			int sum=0;
			
			for (int j = 1; j <=i ; j++) {
				sum +=j;	
			}
			
			//System.out.println(sum);
			result += sum;
		}
		System.out.println(result);
	}
}
