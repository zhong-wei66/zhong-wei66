package cn.zw.io;

import java.io.File;

/**
 * �ļ�״̬
 * 1�������ڣ�
 * 2������
 * �ļ���isFile()
 * �ļ��У�isDirectory()
 * 
 * 
 * @author Administrator
 *
 */
public class FileDemo03 {
	public static void main(String[] args) {
		File src = new File("images\\123.jpg");
		System.out.println(src.getAbsolutePath());
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ����ļ���"+src.isFile());
		System.out.println("�Ƿ����ļ��У�"+src.isDirectory());
		
		System.out.println("**********************");
		src = new File("123.jpg");
		System.out.println(src.getAbsolutePath());
		System.out.println("�Ƿ���ڣ�"+src.exists());
		System.out.println("�Ƿ����ļ���"+src.isFile());
		System.out.println("�Ƿ����ļ��У�"+src.isDirectory());
		
	}

}
