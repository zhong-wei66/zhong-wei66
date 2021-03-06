package homeWork;

/**
 * 这是第三章的编码题3
 * 编写递归算法程序：一列数的规则如下: 
 * 1、1、2、3、5、8、13、21、34...... 
 * 求数列的第40位数是多少。
 * 结果：102334155
 * @author Administrator
 *
 */
public class Day3_Code03 {
	//递归写法
	public static void main(String[] args) {
		
		int num40=result(40);
		System.out.println(num40);
	}
	
	public static int result(int num) {
		if (num==1||num==2) {
			return 1;
		}else {
			return (result(num-1)+result(num-2));
		}
	}
		
		
}
	
	
	
	
	/*循环写法：运算结果是：102334155
	public static void main(String[] args) {
		//初始化第一、二个数
		int num1 = 1;
		int num2 = 1;
		
		//用i记录是第几个数
		for (int i = 1; i <= 40; i++) {
			if (i==1) {
				num1=1;
				num2=1;	
			}else {
				int num3;
				num3=num1;
				num1=num2;
				num2=num3+num2;
				
			}
			//打印每一个数，与题目1、1、2、3、5、8、13、21、34......核对，确保准确性
			//System.out.println(num1);
			
		}
		System.out.println(num1);
	}
	
	*/


