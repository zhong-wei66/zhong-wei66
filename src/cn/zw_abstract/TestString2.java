package cn.zw_abstract;
/**
 * String�ĳ��÷���
 * @author Administrator
 *
 */

public class TestString2 {
	public static void main(String[] args) {
//		String s1= "core Java";
//		String s2= "Core Java";
//		System.out.println(s1.charAt(3));//��ȡ�±�Ϊ3���ַ�
//		System.out.println(s2.length());//�ַ�������
//		System.out.println(s1.equals(s2));//�Ƚ������ַ����Ƿ����
//		System.out.println(s1.equalsIgnoreCase(s2));//�Ƚ������ַ����Ƿ���ȣ����Դ�Сд
//		System.out.println(s1.indexOf("Java"));//�ַ���s1�Ƿ����Java
//		System.out.println(s1.indexOf("apple"));//�ַ���s1�Ƿ����apple
//		String s = s1.replace(" ", "&");//��s1�еĿո��滻��&
//		System.out.println(s);
		
		String s = "";
		String s1 = "How are you?";
		System.out.println(s1.startsWith("How"));//�Ƿ���How��ͷ
		System.out.println(s1.endsWith("you"));//�Ƿ���you��β
		s = s1.substring(4);//��ȡ�ַ��������±�Ϊ4�Ŀ�ʼ���ַ�����β
		System.out.println(s);
		s = s1.substring(4, 7);//��ȡ�ַ������±꡾4��7��������4������7
		System.out.println(s);
		s = s1.toLowerCase();//תСд
		System.out.println(s);
		s = s1.toUpperCase();//ת��д
		System.out.println(s);
		
		String s2 = "  How old are you!! ";
		s = s2.trim();//ȥ���ַ�����β�Ŀո�ע�⣺�м�Ŀո���ȥ��
		System.out.println(s);
		System.out.println(s2);//��ΪString�ǲ��ɱ��ַ���������s2����
				
		
		
		
		
	}

}
