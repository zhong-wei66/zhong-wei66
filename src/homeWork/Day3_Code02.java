package homeWork;
/**
 * ���ǵ����µı�����2
 * ����󣺡�1+��2+����+��100
 * @author Administrator
 *
 */
public class Day3_Code02 {
	public static void main(String[] args) {
		//����һ��result���ڽ��ա�1+��2+����+��100�Ľ��
		int result=0;
		for (int i = 1; i <=100; i++) {
			//����һ��sum���ڽ��ա�j��ֵ
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
