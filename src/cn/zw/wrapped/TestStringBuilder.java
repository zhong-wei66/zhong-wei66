package cn.zw.wrapped;
/**
 * StringBuilder��StringBuffer�ɱ��ַ�����
 * 
 * @author Administrator
 *
 */

public class TestStringBuilder {
	public static void main(String[] args) {
		//StringBuilder�̲߳���ȫ��Ч�ʸߣ�һ��ʹ������
		//StringBuffer�̰߳�ȫ��Ч�ʵ�
		StringBuilder sb=new StringBuilder("abcdefg");
		System.out.println(Integer.toString(sb.hashCode()));//��ӡ�ڴ��ַ
		System.out.println(sb);
		
		sb.setCharAt(2,'M');//����ֻ���ǵ�����
		System.out.println(Integer.toString(sb.hashCode()));//��ӡ�ڴ��ַ
		System.out.println(sb);
		
		
		}

}
