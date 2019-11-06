package cn.zw.io;

import java.io.FileOutputStream;

/**
 * 【示例10-4】将字符串/字节数组的内容写入到文件中
 * @author Administrator
 *
 */

public class TestFileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String string = "你好中国！";
		try {
			//true表示内容会追加到文件末尾，false表示重写整个文件内容
			fos = new FileOutputStream("d:/a.txt",true);
			//getBytes() 是Java编程语言中将一个字符串转化为一个字节数组byte[]的方法。
			fos.write(string.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();//如果try出现异常，将信息打印到控制台
		}finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
