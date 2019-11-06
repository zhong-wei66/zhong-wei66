package cn.zw.io;

import java.io.File;

/**
 * 文件状态
 * 1、不存在：
 * 2、存在
 * 文件：isFile()
 * 文件夹：isDirectory()
 * 
 * 
 * @author Administrator
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File src = new File("images\\123.jpg");
		System.out.println(src.getAbsolutePath());
		System.out.println("是否存在："+src.exists());
		System.out.println("是否是文件："+src.isFile());
		System.out.println("是否是文件夹："+src.isDirectory());
		
		System.out.println("**********************");
		src = new File("123.jpg");
		System.out.println(src.getAbsolutePath());
		System.out.println("是否存在："+src.exists());
		System.out.println("是否是文件："+src.isFile());
		System.out.println("是否是文件夹："+src.isDirectory());
		
	}

}
