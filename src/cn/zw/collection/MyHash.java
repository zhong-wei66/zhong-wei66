package cn.zw.collection;

/**
 * ���Թ�ϣ�㷨
 * @author Administrator
 *
 */
public class MyHash {
	public static void main(String[] args) {
		int h = 25860399;//������
		int length = 16;//length��2�������ݣ���h&(length-1)�൱�ڶ�lengthȡ��
		my_hash(h,length);
		
	}
	 public static int my_hash(int h,int length) {
		System.out.println(h&(length-1));
		//lengthΪ2������������£���ȡ����һ��
		System.out.println(h%length);//ȡ����
		return h&(length-1);
	}
}
