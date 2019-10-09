package ZwJavaStudy07;
/**
 * 数组的三种初始化方式
 * @author Administrator
 *
 */
public class ArryTest02 {
	public static void main(String[] args) {
		//静态初始化
		int[] a = {1,2,45};
		
		User[] b = {
				new User(1001,"钟微"),
				new User(1002,"钟2微"),
				new User(1003,"钟3微"),
		};
		
		//默认初始化
		int[] c = new int[3];//默认给数组的元素赋值，赋值规则和成员变量默认赋值规则一样
		
		
		
		//动态初始化，通过下标挨个赋值
		int[] d = new int[2];//初始化数组，先分配空间
		d[0] = 1;//给元素赋值
		d[1] = 2;
		
		
	}

}
