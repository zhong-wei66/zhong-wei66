package cn.zw.io;

import java.io.FileInputStream;

/**
 * ��ʾ��10-1��ʹ������ȡ�ļ�����(���淶��д���������ڲ���)
 * @author Administrator
 *
 */
public class TestIO1 {
	public static void main(String[] args) {
		try {
			//����������
			FileInputStream fis = new FileInputStream("d:/a.txt");//�ļ����ݣ�abc
			//
			int s1 = fis.read();//��ӡa��Ӧ��ascii��ֵ��97
			int s2 = fis.read();
			int s3 = fis.read();
			int s4 = fis.read();//�ļ������Ѿ���ȡ��ϣ�����-1
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			System.out.println(s4);
			//������ʹ���꣬����رգ���Ȼ��ռ��ϵͳ��Դ�����յ���ϵͳ����
			fis.close();
			
		} catch (Exception e) {
			//��try����г����쳣����ִ��catch�е����
			//e.printStackTrace()���������д�ӡ������Ϣ
			e.printStackTrace();
		}
	}
}
