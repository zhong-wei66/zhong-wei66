package cn.zw.io;

import java.io.File;

public class FileDemo01 {
	/**
	 * ����File����
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "D:/eclipse-workspace/zw_java_study/images/123.jpg";
		
		//1.����File����
		File src = new File(path);
		System.out.println(src.length());
		
		//2.����File����
		src = new File("D:/eclipse-workspace/zw_java_study/images","123.jpg");
		//src = new File(path = "D:/eclipse-workspace","zw_java_study/images/123.jpg");
		System.out.println(src.length());
		
		//3.����File����
		src = new File(new File("D:/eclipse-workspace/zw_java_study/images"),"123.jpg");
		System.out.println(src.length());
		
	}
}
