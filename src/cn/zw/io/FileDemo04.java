package cn.zw.io;

import java.io.File;

/**
 * 
 * @author Administrator
 *
 */
public class FileDemo04 {
	public static void main(String[] args) {
		File src = new File("images/123.jpg");
		
		src = new File("XXXX");
		if (null == src || !src.exists()) {
			System.out.println("�ļ�������");
		}else {
			if (src.isFile()) {
				System.out.println("�ļ�����");
			}else {
				System.out.println("�ļ��в���");
			}
		}
		
		
		
		
	}

}
