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
			System.out.println("文件不存在");
		}else {
			if (src.isFile()) {
				System.out.println("文件操作");
			}else {
				System.out.println("文件夹操作");
			}
		}
		
		
		
		
	}

}
