package cn.zw.io;

import java.io.File;

/**
 * ���Ʒָ���
 * 
 *
 */
public class PathDemo01 {
	public static void main(String[] args) {
		String path = "D:\\eclipse-workspace\\zw_java_study\\images\\123.jpg";
		System.out.println(File.separatorChar);
		
		//����
		//1��/
		path = "D:/eclipse-workspace/zw_java_study/images/123.jpg";
		System.out.println(path);
		//2������ƴ��
		path = "D:"+File.separator+"eclipse-workspace"+File.separator+"zw_java_study"+File.separator+"images"+File.separator+"123.jpg";
		System.out.println(path);
		
		
	}
}
