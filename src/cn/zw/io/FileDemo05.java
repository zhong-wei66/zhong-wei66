package cn.zw.io;

import java.io.File;

/**
 * length()���ļ����ֽ���
 * @author Administrator
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study/images/123.jpg");
		System.out.println("�ֽ�����"+src.length());
		src = new File("D:/eclipse-workspace/zw_java_study/images");
		System.out.println("�ֽ�����"+src.length());
	
		
	}

}
