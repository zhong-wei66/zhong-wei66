package cn.zw_abstract;

/**
 *�ַ�����Ļ����÷�
 * @author Administrator
 *
 */
public class TestString {
	public static void main(String[] args) {
		String str = "abc";
		String str2 = new String("def");
		String str3 = "18"+19;
		String str4 = "abc"+"def";
		System.out.println(str3);
		
		
		System.out.println("############");
		
		String str10 ="zhongwei";
		String str11 ="zhongwei";
		String str12 =new String("zhongwei");
		
		System.out.println(str10==str11);//true,ָ��������ͬһ���ַ�������
		System.out.println(str12==str11);//false,str12���½���һ�����󣬲�����ڳ�������
		
		//ͨ���Ƚ��ַ���ʱ���ǱȽ��ַ�����ֵ�Ƿ���ȣ���equals
		System.out.println(str12.equals(str11));
		
		
		
	}

}
