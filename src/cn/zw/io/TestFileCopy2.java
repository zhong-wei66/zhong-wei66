package cn.zw.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ʾ��10-6��ʹ��FileReader��FileWriterʵ���ı��ļ��ĸ���
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
			//���������õ��ַ�����
			char[] buffer = new char[1024];
			//�߶���д
			while ((len = fr.read(buffer))!= -1) {
				fw.write(buffer,0,len);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			//�ر�������
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
