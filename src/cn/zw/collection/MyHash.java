package cn.zw.collection;

/**
 * 测试哈希算法
 * @author Administrator
 *
 */
public class MyHash {
	public static void main(String[] args) {
		int h = 25860399;//任意数
		int length = 16;//length是2的整数幂，则h&(length-1)相当于对length取余
		my_hash(h,length);
		
	}
	 public static int my_hash(int h,int length) {
		System.out.println(h&(length-1));
		//length为2的整数幂情况下，和取余结果一样
		System.out.println(h%length);//取余数
		return h&(length-1);
	}
}
