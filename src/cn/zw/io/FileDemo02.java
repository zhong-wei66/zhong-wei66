package cn.zw.io;

import java.io.File;

public class FileDemo02 {
	/**
	 * 构建File对象
	 * 相对路径与绝对路径
	 * 1、有盘符：绝对路径
	 * 2、没有盘符：相对路径，当前目录user.dir
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "D:/eclipse-workspace/zw_java_study/images/123.jpg";
		
		//绝对路径
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
	
		//相对路径
		System.out.println("当前目录： "+System.getProperty("user.dir"));//当前目录
		src = new File("123.jpg");
		System.out.println(src.getAbsolutePath());
		
		//构建一个不存在的文件
		src = new File("1234.jpg");
		System.out.println(src.getAbsolutePath());
		
	}
}
