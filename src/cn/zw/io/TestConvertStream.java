package cn.zw.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.InflaterInputStream;

/**
 * 10.2.8 ת����
 * ��ʾ��10-12��ʹ��InputStreamReader�����û������룬�����������̨
 * 
 */

public class TestConvertStream {
	// InputStreamReader/OutputStreamWriterʵ�ֽ��ֽ���ת�����ַ���
	public static void main(String[] args) {
		//�����ַ����������������ʹ��ת�������ֽ���ת�����ַ���
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));//OutputStreamWriter���ֽ���ת��Ϊ�ַ���
			//ʹ���ַ�����������
			String str = br.readLine();//readLine()��ȡ�������ݵ�ʱ���ã�ͬʱ�����ַ�����ʽ������һ�е����ݣ�����ȡ�����е�����ʱ�᷵��null��
			//һֱ��ȡ��֪���û�����exitΪֹ
			while (!"exit".equals(str)) {
				//д������̨
				bw.write(str);
				bw.newLine();//дһ�к�һ��
				bw.flush();//�ֶ�ˢ��
				//����дһ��
				str = br.readLine();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر���
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
