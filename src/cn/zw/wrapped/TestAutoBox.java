package cn.zw.wrapped;
/**
 * �Զ�װ�䡢�Զ�����
 * @author Administrator
 *
 */
public class TestAutoBox {
	public static void main(String[] args) {
		Integer a=234;//�Զ�װ�䣬���������޸�Ϊ��Integer a=integer.valueOf(234)
		
		int b=a;//�Զ����䣬���������޸�Ϊ��int b=a.intValue()
		
		Integer c=null;
//		if (c!=null) {
//			int d=c;
//		}
		
		//����[-128,127]֮������֡�ʵ�ʾ���ϵͳ�ڳ�ʼ��ʱ�򣬴�����[-128,127]֮���һ����������
		//�����ǵ���valueOf()��ʱ�����ȼ���Ƿ���[-128,127]֮��
		//����������Χ��ֱ�Ӵӻ���������ֱ���ó��Ѿ�����õĶ���
		//������������Χ���򴴽��µ�Integer����
		Integer in1=Integer.valueOf(-128);
		Integer in2=-128;
		System.out.println(in1==in2);//true����Ϊ-128�ڻ��淶Χ��
		System.out.println(in1.equals(in2));//true
		
		System.out.println("##########");
		
		Integer in3=1234;
		Integer in4=1234;
		System.out.println(in3==in4);//false����Ϊ1234���ڻ��淶Χ��
		System.out.println(in3.equals(in4));//true
		
	}

}
