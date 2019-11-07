package cn.zw.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ��ʾ��10-8��ʹ��BufferedReader��BufferedWriterʵ���ı��ļ��ĸ���
 * @author Administrator
 *
 */
public class TestBufferedFileCopy2 {
	public static void main(String[] args) {
		//�����ı��ļ�ʱ��ʵ�ʿ����п��Լ�������д�����򵥸�Ч
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String  tempString = "";
		try {
			fr = new FileReader("d:/a.txt");
			fw = new FileWriter("d:/d.txt");
			//ʹ�û����ַ������а�װ
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			//BufferedReader�ṩ�˸������readLine()������ֱ�Ӱ��ж�ȡ�ı�
            //br.readLine()�����ķ���ֵ��һ���ַ������󣬼��ı��е�һ������
            while ((tempString = br.readLine()) != null) {
				//����ȡ��һ���ַ���д���ļ���
            	bw.write(tempString);
				//�´�д��ǰ�Ȼ���
            	bw.newLine();
            	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}
}
