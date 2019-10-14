package homeWork;

import java.util.Scanner;

/**
 * 第二章编码题1
 * 输入圆形半径，求圆形的周长和圆形的面积，并将结果输出
 * @author Administrator
 *
 */

public class day2_code01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入半径：");
		String r=scanner.nextLine();
		System.out.println("当前输入的半径是："+r);	
		double p=Math.PI;
		System.out.println(p);
		//把半径由string类型转为double类型
		double r2=Double.parseDouble(r);
		double L=2*p*r2;
		
		System.out.println("周长是："+L);
		System.out.println("面积是："+p*r2*r2);
		
		
		
		
		
	}

}
