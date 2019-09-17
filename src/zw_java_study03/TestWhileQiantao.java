package zw_java_study03;
/**
 * 测试嵌套
 * @author Administrator
 *
 */

public class TestWhileQiantao {
	public static void main(String[] args) {
		/*这里是打印99乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" * "+j+" = "+i*j+"\t");
				
			}
			System.out.println();
		}
		
		*/
		
		/*这里是whlie循环打印出100内的奇数和、偶数和
		int m=1;
		int sumj = 0;
		int sumo = 0;
		while (m<=100) {
			if (m%2==0) {
				sumo +=m;
				m++;
			}
			else {
				sumj +=m;
				m++ ;
			}
				
			}
		System.out.println("m = "+ m);
		System.out.println("奇数和为："+sumj);
		System.out.println("偶数和为："+sumo);
		
		*/
		
	//i代表数字，num代表可以被5整除的数字的个数
	//这个是打印出1000内能被5整除的数，每行显示5个数
	int num = 0;
	for (int i = 1; i <= 1000; i++) {
		
		if (i%5==0) {
			System.out.print(i+" ");
			num++;
			if (num%5==0) {
				System.out.print("\n");
			}
		}
	}
	System.out.println("****************");
	}

}







