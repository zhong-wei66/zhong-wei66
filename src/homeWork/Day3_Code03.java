package homeWork;

/**
 * ���ǵ����µı�����3
 * ��д�ݹ��㷨����һ�����Ĺ�������: 
 * 1��1��2��3��5��8��13��21��34...... 
 * �����еĵ�40λ���Ƕ��١�
 * �����102334155
 * @author Administrator
 *
 */
public class Day3_Code03 {
	//�ݹ�д��
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
	
	
	
	
	/*ѭ��д�����������ǣ�102334155
	public static void main(String[] args) {
		//��ʼ����һ��������
		int num1 = 1;
		int num2 = 1;
		
		//��i��¼�ǵڼ�����
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
			//��ӡÿһ����������Ŀ1��1��2��3��5��8��13��21��34......�˶ԣ�ȷ��׼ȷ��
			//System.out.println(num1);
			
		}
		System.out.println(num1);
	}
	
	*/


