package cn.zw.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * ��ʾ��10-9���򵥲���ByteArrayInputStream ��ʹ��
 * @author Administrator
 *
 */

public class TestByteArray {
	public static void main(String[] args) {
		//���ַ���תΪ�ֽ�����
		byte[] b = "abcdefg".getBytes();
		test(b);
		
	}
	public static void test(byte[] b) {
		ByteArrayInputStream bais = null;
		StringBuilder sb = new StringBuilder();
		int temp = 0;
		//ʹ�ñ����ȡ���ֽ���
		int num = 0;
		try {
			//�ù��췽���Ĳ�����һ���ֽ����飬����ֽ������������Դ
			bais = new ByteArrayInputStream(b);
			while ((temp = bais.read()) != -1) {
				sb.append((char)temp);
				num++;
			}
			System.out.println(sb);
			System.out.println("��ȡ���ֽ�����" + num);
		} finally {
			try {
				
				if (bais != null) {
					bais.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
