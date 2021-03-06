package cn.zw.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 【示例10-9】简单测试ByteArrayInputStream 的使用
 * @author Administrator
 *
 */

public class TestByteArray {
	public static void main(String[] args) {
		//将字符串转为字节数组
		byte[] b = "abcdefg".getBytes();
		test(b);
		
	}
	public static void test(byte[] b) {
		ByteArrayInputStream bais = null;
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		//使用保存读取的字节数
		int num = 0;
		try {
			//该构造方法的参数是一个字节数组，这个字节数组就是数据源
			bais = new ByteArrayInputStream(b);
			while ((temp = bais.read()) != -1) {
				sb.append((char)temp);
				num++;
			}
			System.out.println(sb);
			System.out.println("读取的字节数：" + num);
		} finally {
			try {
				
				if (bais != null) {
					bais.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
