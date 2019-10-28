package homeWork;

/**
 * 第七章，编码题3
 * 数组逆序操作：定义长度为10的数组，将数组元素对调，并输出对调前后的结果。
 * 思路：把0索引和arr.length-1的元素交换，把1索引和arr.length-2的元素交换…..
 * 只要交换到arr.length/2的时候即可。
 * @author Administrator
 *
 */

class arrSwap{//定义一个数组交换类
	
	int[] arr = {1,2,3,4,5};
	public void swap() {
		int num;
		for (int i = 0; i < arr.length/2; i++) {
			num = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = num;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
public class day7_code03 {
	public static void main(String[] args) {
		arrSwap result = new arrSwap();
		result.swap();
	}
}
