package cn.zw.wrapped;
/**
 * StringBuilder、StringBuffer可变字符序列的常用方法
 * @author Administrator
 *
 */
public class TestStringBuilder2 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		//打印26个字符
		for (int i = 0; i < 26; i++) {
			char temp=(char)('a'+i);
			sb.append(temp);
		}
		System.out.println(sb);
		
		sb.reverse();//倒叙
		System.out.println(sb);
		
		sb.setCharAt(3, '钟');//把w替换成钟
		System.out.println(sb);
		
		sb.insert(0, '我').insert(6, '爱').insert(10, '你');//插入字符
		System.out.println(sb);
		
		sb.delete(20, 23);//删除
		System.out.println(sb);
		
		
	}

}
