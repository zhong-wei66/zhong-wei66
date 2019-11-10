package cn.zw.io;

import java.io.File;

/*
 * 递归：方法自己调自己
 * 递归头：何时结束递归
 * 递归体：重复调用
 * 打印子孙级目录和文件的名称
 * 
 */



public class DirDemo04 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study");
		printName(src,0);
	}
	//打印子孙级目录和文件的名称
	public static void printName(File src,int deep) {//deep代表第几层，有几层打印几个-
		//控制层次
		for (int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		//打印名称
		System.out.println(src.getName());
		if (null == src || !src.exists()) {//递归头
			return;
		}else if (src.isDirectory()) {//目录
			for (File s:src.listFiles()) {//listFiles()：返回某个目录下所有文件和目录的绝对路径，返回的是File数组
				printName(s, deep+1);//递归体
			}
		}
	}

}
