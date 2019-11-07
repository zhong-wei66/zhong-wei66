package cn.zw.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 【示例10-6】使用FileReader与FileWriter实现文本文件的复制
 * @author Administrator
 *
 */
public class TestFileCopy2 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		int len = 0;
		try {
			fr = new FileReader("d:/a.txt");
			fw = new FileWriter("d:/d.txt");
			//创建缓冲用的字符数组
			char[] buffer = new char[1024];
			//边读边写
			while ((len = fr.read(buffer))!= -1) {
				fw.write(buffer,0,len);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			//关闭两个流
			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
