package cn.zw.io;

import java.io.File;

/**
 * length()�������ļ����ֽ���
 * @author Administrator
 *
 */
public class FileDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study/images/123.jpg");
		System.out.println("�ļ��ֽ�����"+src.length());
		src = new File("D:/eclipse-workspace/zw_java_study/images");
		System.out.println("�ֽ�����"+src.length());//images���ļ����˴�����0
		
		src = new File("D:/eclipse-workspace/zw_java_study/images2");//û��images2�ļ�������0
		System.out.println("�ֽ�����"+src.length());
		
		
	}

}
