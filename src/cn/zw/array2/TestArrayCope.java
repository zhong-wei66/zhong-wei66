package cn.zw.array2;
/**
 * ����Ŀ���
 * @author Administrator
 *
 */
public class TestArrayCope {
	
	public static void main(String[] args) {
		String[] s1= {"aa","bb","cc","dd","ee"};
		String[] s2=new String[10];
		System.arraycopy(s1,2,s2,6,3);
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(i+"--"+s2[i]);
			
		}
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src������
		//srcPos����src����ڼ�����ʼ����
		//dest��Ŀ������
		//destPos����Ŀ������dest�ڼ�����ʼ����
		//length����������
		
		
		System.out.println("*************************");
		
		//���Դ�������ɾ��ĳ��Ԫ�أ������ϻ�˵����Ŀ���
		//ɾ��������ָ������λ�õ�Ԫ�أ�����ԭ���鷵��
		//��String[] s3= {"aa","bb","cc","dd","ee"};ɾ��cc
		String[] s3= {"aa","bb","cc","dd","ee"};
		//String[] s4=new String[10];
		System.arraycopy(s3,3 , s3,3-1,s1.length-3 );
		//System.arraycopy(s3, 3, s4, 7, 2);
		
		//�����һ��Ԫ����Ϊ��
		s3[s3.length-1]=null;
		
		for (int i = 0; i < s3.length; i++) {
			System.out.println(i+"--"+s3[i]);
			
		}
		
		
	}
	
	
	

	

}
