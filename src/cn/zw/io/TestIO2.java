package cn.zw.io;

import java.io.FileInputStream;

/**
 * ��ʾ��10-2��ʹ������ȡ�ļ�����(������룬һ��Ҫ����)
 * @author Administrator
 *
 */

public class TestIO2 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:/a.txt");//������abc
			StringBuilder sb = new StringBuilder();
			int temp = 0;
			//��temp����-1ʱ����ʾ�Ѿ������ļ���β��ֹͣ��ȡ
			while ((temp = fis.read())!=-1) {
				sb.append((char)temp);
				
			}
			System.out.println(sb);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//����д������֤�˼�ʹ�����쳣�����Ҳ��ر�������
				while (fis != null) {
					fis.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
