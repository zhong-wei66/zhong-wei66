package cn.zw.io;

import java.io.File;

public class FileDemo01 {
	/**
	 * 构建File对象
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "D:/eclipse-workspace/zw_java_study/images/123.jpg";
		
		//1.构建File对象
		File src = new File(path);
		System.out.println(src.length());
		
		//2.构建File对象
		src = new File("D:/eclipse-workspace/zw_java_study/images","123.jpg");
		//src = new File(path = "D:/eclipse-workspace","zw_java_study/images/123.jpg");
		System.out.println(src.length());
		
		//3.构建File对象
		src = new File(new File("D:/eclipse-workspace/zw_java_study/images"),"123.jpg");
		System.out.println(src.length());
		
	}
}
