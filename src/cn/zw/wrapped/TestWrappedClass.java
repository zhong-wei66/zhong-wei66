package cn.zw.wrapped;
/**
 * ��װ��
 * @author Administrator
 *
 */

public class TestWrappedClass {
	public static void main(String[] args) {
		//������������ת�ɰ�װ�����
		Integer a=new Integer(3);
		Integer b=Integer.valueOf(30);//�Ƽ�����д��
//		System.out.println(a);
//		System.out.println(b);
		
		//��װ�����תΪ������������
		int c = b.intValue();		
		double d=b.doubleValue();
		
		
//		System.out.println(c);
//		System.out.println(d);
		
		//�ַ���תΪ��װ�����
		Integer e=new Integer("999");
		Integer f=Integer.parseInt("999988");
		
//		System.out.println(e);		
//		System.out.println(f);

		
		//��װ�����תΪ�ַ���
		String str=f.toString();
//		System.out.println(f);
		
		//�����ĳ���
		System.out.println("int��������������"+Integer.MAX_VALUE);
		
	}

}
