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
		int d=c;
	}

}
