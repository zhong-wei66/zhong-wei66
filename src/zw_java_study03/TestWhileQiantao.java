package zw_java_study03;
/**
 * ����Ƕ��
 * @author Administrator
 *
 */

public class TestWhileQiantao {
	public static void main(String[] args) {
		/*�����Ǵ�ӡ99�˷���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" * "+j+" = "+i*j+"\t");
				
			}
			System.out.println();
		}
		
		*/
		
		/*������whlieѭ����ӡ��100�ڵ������͡�ż����
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
		System.out.println("������Ϊ��"+sumj);
		System.out.println("ż����Ϊ��"+sumo);
		
		*/
		
	//i�������֣�num������Ա�5���������ֵĸ���
	//����Ǵ�ӡ��1000���ܱ�5����������ÿ����ʾ5����
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







