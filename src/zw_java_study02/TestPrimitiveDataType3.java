package zw_java_study02;
/**
 * �ַ��ͺͲ�������
 * @author Administrator
 *
 */

public class TestPrimitiveDataType3 {
	public static void main(String[] args) {
		char a1 = 'T';
		char b1 = '��';
		char c1 ='\u0061';
		System.out.println(c1);
		
		System.out.println("����+��char�����Զ�תΪ����");
		System.out.println('a'+'b');
		System.out.println("########################");
		//ת���ַ�
		
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');
		
		//String�����ַ�����
		String d = "abc";
		
		//���Բ�������
		boolean man = false;
		if (man) {//���Ƽ�д��man==true
			System.out.println("����");
		}
		else {
			System.out.println("Ů��");
		}
	}

}
