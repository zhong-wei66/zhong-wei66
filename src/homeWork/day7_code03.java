package homeWork;

/**
 * �����£�������3
 * ����������������峤��Ϊ10�����飬������Ԫ�ضԵ���������Ե�ǰ��Ľ����
 * ˼·����0������arr.length-1��Ԫ�ؽ�������1������arr.length-2��Ԫ�ؽ�����..
 * ֻҪ������arr.length/2��ʱ�򼴿ɡ�
 * @author Administrator
 *
 */

class arrSwap{//����һ�����齻����
	
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
