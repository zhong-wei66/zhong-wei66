package homeWork;
/**
 * �ڶ��£�������2
 * 2.�������ʱ����±���ʾ���������10000Ԫ������1�ꡢ����2�꣬����1�꣬����2���ı�Ϣ�ϼơ�
 * ������Ŀ                        �����ʣ�%��
 * ���ڴ��                         0.35
 * �����¶��ڴ��              1.10
 * ���궨�ڴ��                  1.30
 * һ�궨�ڴ��                  1.50
 * ���궨�ڴ��                  2.10
 * 
 * �Խ���������룬������С����ʹ��Math.round(double d)ʵ��
 * 
 * @author Administrator
 *
 */

public class day2_code02 {
	public static void main(String[] args) {
		//����
		int money=10000;
		
		System.out.println("����1�꣬�����ܼƣ�"+Math.round(money*(1+0.35/100)));
		System.out.println("����2�꣬�����ܼƣ�"+Math.round(money*(1+0.35/100)*(1+0.35/100)));
		System.out.println("����1�꣬�����ܼƣ�"+Math.round(money*(1+1.50/100)));
		System.out.println("����2�꣬�����ܼƣ�"+Math.round(money*(1+2.10/100)*(1+2.10/100)));
		
//		����Math.round(double d)
//		double d=1.23;
//		Math.round(d);
//		System.out.println(Math.round(d));
//		����ƽ��
//		int i=5;
//		System.out.println(Math.pow(i, 2));
		
	}

}
