package cn.zw.io;

import java.io.FileOutputStream;

/**
 * ��ʾ��10-4�����ַ���/�ֽ����������д�뵽�ļ���
 * @author Administrator
 *
 */

public class TestFileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String string = "����й���";
		try {
			//true��ʾ���ݻ�׷�ӵ��ļ�ĩβ��false��ʾ��д�����ļ�����
			fos = new FileOutputStream("d:/a.txt",true);
			//getBytes() ��Java��������н�һ���ַ���ת��Ϊһ���ֽ�����byte[]�ķ�����
			fos.write(string.getBytes());
			
		} catch (Exception e) {
			e.printStackTrace();//���try�����쳣������Ϣ��ӡ������̨
		}finally {
			try {
				if (fos != null) {
					fos.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
