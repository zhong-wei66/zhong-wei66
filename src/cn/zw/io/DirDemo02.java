package cn.zw.io;
/*
 * �г���һ��
 * list():�г���һ������
 * listFiles():�г���һ������
 * listRoots()���г������̷�
 * 
 */

import java.io.File;

import javax.swing.JSpinner.DateEditor;

public class DirDemo02 {
	public static void main(String[] args) {
		File dir = new File("D:/eclipse-workspace/zw_java_study");
		//��һ������
		String[] subName = dir.list();
		for (String s:subName) {
			System.out.println(s);
		}
		System.out.println("-----------------");
		
		//�г���һ������
		File[] subFiles = dir.listFiles();//listFiles()�������·��
		for (File s:subFiles) {
			System.out.println(s.getAbsolutePath());
		}
		System.out.println("--------");
		//�г������̷�
		File[] roots = dir.listRoots();
		for (File r:roots) {
			System.out.println(r);
		}
	}

}
