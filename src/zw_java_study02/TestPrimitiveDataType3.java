package zw_java_study02;
/**
 * 字符型和布尔类型
 * @author Administrator
 *
 */

public class TestPrimitiveDataType3 {
	public static void main(String[] args) {
		char a1 = 'T';
		char b1 = '尚';
		char c1 ='\u0061';
		System.out.println(c1);
		
		System.out.println("遇到+，char类型自动转为数字");
		System.out.println('a'+'b');
		System.out.println("########################");
		//转义字符
		
		System.out.println(""+'a'+'\n'+'b');
		System.out.println(""+'a'+'\t'+'b');
		System.out.println(""+'a'+'\''+'b');
		
		//String就是字符序列
		String d = "abc";
		
		//测试布尔类型
		boolean man = false;
		if (man) {//不推荐写成man==true
			System.out.println("男性");
		}
		else {
			System.out.println("女性");
		}
	}

}
