package cn.zw.wrapped;
/**
 * StringBuilder��StringBuffer�ɱ��ַ����еĳ��÷���
 * @author Administrator
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		//��ӡ26���ַ�
		for (int i = 0; i < 26; i++) {
			char temp=(char)('a'+i);
			sb.append(temp);
		}
		System.out.println(sb);
		
		sb.reverse();//����
		System.out.println(sb);
		
		sb.setCharAt(3, '��');//��w�滻����
		System.out.println(sb);
		
		sb.insert(0, '��').insert(6, '��').insert(10, '��');//�����ַ�
		System.out.println(sb);
		
		sb.delete(20, 23);//ɾ��
		System.out.println(sb);
		
		
	}

}
