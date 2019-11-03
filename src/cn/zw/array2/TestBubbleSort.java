package cn.zw.array2;

import java.util.Arrays;

/**
 * ц╟ещеепР
 * @author Administrator
 *
 */
public class TestBubbleSort {
	
	public static void main(String[] args) {
		
		int[] a = {3, 1, 6, 2, 9, 0, 7, 4, 5, 8 };
		int num;
		for (int i = 0; i < a.length-1-i; i++) {

			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]>a[j+1]) {
					num = a[j];
					a[j] = a[j+1];
					a[j+1] = num;
				}
				
//				System.out.println(Arrays.toString(a));
			}
			
		}
		System.out.println(Arrays.toString(a));

	}

}
