package cn.zw.io;

import java.io.File;

/**
 * length()：返回文件的字节数
 * @author Administrator
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study/images/123.jpg");
		System.out.println("文件字节数："+src.length());
		src = new File("D:/eclipse-workspace/zw_java_study/images");
		System.out.println("字节数："+src.length());//images是文件，此处返回0
		
		src = new File("D:/eclipse-workspace/zw_java_study/images2");//没有images2文件，返回0
		System.out.println("字节数："+src.length());
		
		
	}

}
