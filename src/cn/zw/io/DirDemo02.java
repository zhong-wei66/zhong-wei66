package cn.zw.io;
/*
 * 列出下一级
 * list():列出下一级名称
 * listFiles():列出下一级对象
 * listRoots()：列出所有盘符
 * 
 */

import java.io.File;

import javax.swing.JSpinner.DateEditor;

public class DirDemo02 {
	public static void main(String[] args) {
		File dir = new File("D:/eclipse-workspace/zw_java_study");
		//下一级名称
		String[] subName = dir.list();
		for (String s:subName) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		
		//列出下一级对象
		File[] subFiles = dir.listFiles();//listFiles()输出绝对路径
		for (File s:subFiles) {
			System.out.println(s.getAbsolutePath());
		}
		System.out.println("--------");
		//列出所有盘符
		File[] roots = dir.listRoots();
		for (File r:roots) {
			System.out.println(r);
		}
	}

}
