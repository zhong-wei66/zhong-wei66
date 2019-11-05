package cn.zw.io;

import java.io.File;

public class FileDemo02 {
	/**
	 * ����File����
	 * ���·�������·��
	 * 1�����̷�������·��
	 * 2��û���̷������·������ǰĿ¼user.dir
	 * @param args
	 */
	public static void main(String[] args) {
		String path = "D:/eclipse-workspace/zw_java_study/images/123.jpg";
		
		//����·��
		File src = new File(path);
		System.out.println(src.getAbsolutePath());
	
		//���·��
		System.out.println("��ǰĿ¼�� "+System.getProperty("user.dir"));//��ǰĿ¼
		src = new File("123.jpg");
		System.out.println(src.getAbsolutePath());
		
		//����һ�������ڵ��ļ�
		src = new File("1234.jpg");
		System.out.println(src.getAbsolutePath());
		
	}
}
