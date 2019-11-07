package cn.zw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * ��ʾ��10-7��ʹ�û�����ʵ���ļ��ĸ�Ч�ʸ���
 * @author Administrator
 *
 */

public class TestBufferedFileCopy1 {
	public static void main(String[] args) {
		//ʹ�û����ֽ���ʵ�ָ���
		long time1 = System.currentTimeMillis();
		copyFile1("D:/����/����_���ٺ�_128K.mp3", "D:/����/�½��ļ���"+"����_���ٺ�_128K.mp3");
		long time2 = System.currentTimeMillis();
		System.out.println("�����ֽ������ѵ�ʱ��Ϊ��" + (time2 - time1));
		
		//ʹ����ͨ�ֽ������и���
		long time3 = System.currentTimeMillis();
		copyFile2("D:/����/����_���ٺ�_128K.mp3", "D:/����/�½��ļ���"+"����_���ٺ�_128K.mp3");
		long time4 = System.currentTimeMillis();
		System.out.println("��ͨ�ֽ������ѵ�ʱ��Ϊ��" + (time4 - time3));
		
	}

	//�����ֽ���ʵ�ֵ��ļ����Ʒ���
	static void copyFile1(String src,String dec) {
		FileInputStream fis = null;//�ļ��ֽ���
		BufferedInputStream bis = null;//�����ֽ���
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int temp = 0;
		try {
			fis =new FileInputStream(src);
			fos = new FileOutputStream(dec);
			//ʹ�û����ֽ�����װ�ļ��ֽ��������ӻ��幦�ܣ����Ч��
			//���������С����������ĳ��ȣ�Ĭ����8192��Ҳ�����Լ�ָ����С
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			while ((temp = bis.read())!=-1) {
				bos.write(temp);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//ע�⣺���Ӵ�������ע�����Ĺر�˳�򣡡��󿪵��ȹرա�
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	//��ͨ����ʵ�ֵ��ļ����Ʒ���
	static void copyFile2(String src,String dec) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			while ((temp = fis.read()) != -1) {
				fos.write(temp);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر���
			try {
				if (fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if (fis != null) {
					fis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

