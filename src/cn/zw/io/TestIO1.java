package cn.zw.io;

import java.io.FileInputStream;

/**
 * 【示例10-1】使用流读取文件内容(不规范的写法，仅用于测试)
 * @author Administrator
 *
 */
public class TestIO1 {
	public static void main(String[] args) {
		try {
			//创建输入流
			FileInputStream fis = new FileInputStream("d:/a.txt");//文件内容：abc
			//
			int s1 = fis.read();//打印a对应的ascii码值：97
			int s2 = fis.read();
			int s3 = fis.read();
			int s4 = fis.read();//文件内容已经读取完毕，返回-1
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			//对象流使用完，必须关闭！不然会占用系统资源，最终导致系统崩溃
			fis.close();
			
		} catch (Exception e) {
			//当try语句中出现异常，会执行catch中的语句
			//e.printStackTrace()：在命令行打印错误信息
			e.printStackTrace();
		}
	}
}
