package zw_java_study03;
/**
 * ����ѭ������е�break
 * @author Administrator
 *
 */

public class TestBreak {
	public static void main(String[] args) {
		int n = 0;
		while (true) {
			n++;
			int i = (int)(100*Math.random()); //��0��1��
			System.out.println(i);
			if (i==88) {
				break;
			}
		System.out.println(i);	
		}
		System.out.println("game over"+n);
	}

}
