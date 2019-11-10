package cn.zw.io;
/*
 * 创建目录
 * mkdir():上一级目录存在则可以创建
 * mkdirs()：不论上一级目录是否存在都可以创建成功
 */

import java.io.File;

public class DirDemo01 {
	public static void main(String[] args) {
		File dir = new File("D:/eclipse-workspace/zw_java_study/dir/test");
		//创建目录
		boolean flag = dir.mkdir();//因为不存在dir目录所以创建test文件失败
		System.out.println(flag);
		
		flag = dir.mkdirs();
		System.out.println(flag);
	
		
		
	}

}
