package cn.zw.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ��ʾ��10-5�������ļ���ʵ���ļ��ĸ���
 * @author Administrator
 *
 */

public class TestFileCopy {
	public static void main(String[] args) {
		copyFile("d:/a.txt", "d:/b.txt");
		
	}
	
	/**
	 * ��src�ļ������ݿ�����dec�ļ�
	 * src Դ�ļ�
	 * decĿ���ļ�
	 */
	
	static void copyFile(String src,String dec) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//Ϊ�����Ч�ʣ����û������飡����ȡ���ֽ����ݻ��ݴ�ŵ����ֽ������У�
		byte[] buffer = new byte[1024];//����һ��byte���͵����飬���鳤����1024
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			//�߶���д
			//tempֵ���Ǳ��ζ�ȡ����ʵ���ȣ�temp����-1ʱ����ʾ��ȡ����
			while ((temp = fis.read(buffer))!=-1) {
				/**
				 * �����������е�����д���ļ��У�ע�⣺д���ʱ��ȡ����ʵ����
				 * ���ʹ��fis.read(buffer)��������ôд��ĳ��Ƚ���10224������������ĳ���
				 */
				fos.write(buffer,0,temp);
				
			}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//��������Ҫ�ر�
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
