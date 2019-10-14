package cn.zw.array2;
/**
 * 二维数组
 * @author Administrator
 *
 */

public class Test2DimensionArry {
	public static void main(String[] args) {
//	一维数组
//		int[] a=new int[3];
//		Car[] cars = new Car[3];
		
//		二维数组
		int[][] a= new int[3][];
		a[0]=new int[] {20,30};
		a[1]=new int[] {10,15,80};
		a[2]=new int[] {50,60};
		
		System.out.println(a[1][2]);
		
//		静态初始化二维数组
		int[][] b = {
				{20,30,40},
				{15,25,35,45},
				{1,2}
		};
		
		System.out.println(b[2][1]);
	
	}

}


class Car{
	
}
