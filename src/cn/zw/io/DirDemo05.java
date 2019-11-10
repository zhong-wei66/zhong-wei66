package cn.zw.io;

import java.io.File;

/*
 * 统计文件夹的大小
 * 
 */



public class DirDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study");
		count(src);
		System.out.println(len);
	}
	private static long len = 0;
	//打印子孙级目录和文件的名称
	public static void count(File src) {//deep代表第几层，有几层打印几个-
		
		//获取大小
		if (src != null && src.exists()) {//src != null:路径不为空，src.exists()：文件路径是否存在
			if (src.isFile()) {//大小
				len += src.length();
			}else {//子孙级
				for (File s:src.listFiles()) {
					count(s);
				}
			}
		}
	}	
	
}
