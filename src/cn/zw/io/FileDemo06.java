package cn.zw.io;

import java.io.File;
import java.io.IOException;

/**
 * ������Ϣ��
 * createNewFile():�����ڲŴ����������ɹ�����true���Ѵ��ڲ����ظ�����������false
 * delete():ɾ���Ѿ����ڵ��ļ�
 * 
 */
public class FileDemo06 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/eclipse-workspace/zw_java_study/images/io.txt");
		boolean flag = src.createNewFile();//createNewFile()��ʱ��ʧ��
		System.out.println(flag);//�鿴�ļ��Ƿ񴴽��ɹ�
		//ɾ��
		flag=src.delete();
		System.out.println(flag);
		
		System.out.println("-----------");
		
		//�����ļ���
		src = new File("D:/eclipse-workspace/zw_java_study/images2");
		flag = src.createNewFile();//createNewFile()��ʱ��ʧ��
		System.out.println(flag);//�鿴�ļ��Ƿ񴴽��ɹ�
		//ɾ��
		flag=src.delete();
		System.out.println(flag);
		
		
		//����con��con3�ǲ���ϵͳ���豸����������ȷ����
		src = new File("D:/eclipse-workspace/zw_java_study/con");
		flag = src.createNewFile();//createNewFile()��ʱ��ʧ��
		System.out.println(flag);
		
	}

}
