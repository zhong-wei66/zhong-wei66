package homeWork;

import java.util.Scanner;

/**
 * �ڶ��±�����1
 * ����Բ�ΰ뾶����Բ�ε��ܳ���Բ�ε����������������
 * @author Administrator
 *
 */

public class day2_code01 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������뾶��");
		String r=scanner.nextLine();
		System.out.println("��ǰ����İ뾶�ǣ�"+r);	
		double p=Math.PI;
		System.out.println(p);
		//�Ѱ뾶��string����תΪdouble����
		double r2=Double.parseDouble(r);
		double L=2*p*r2;
		
		System.out.println("�ܳ��ǣ�"+L);
		System.out.println("����ǣ�"+p*r2*r2);
		
		
		
		
		
	}

}
