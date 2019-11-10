package cn.zw.io;

import java.io.File;

/*
 * �ݹ飺�����Լ����Լ�
 * �ݹ�ͷ����ʱ�����ݹ�
 * �ݹ��壺�ظ�����
 * ��ӡ���ＶĿ¼���ļ�������
 * 
 */



public class DirDemo04 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study");
		printName(src,0);
	}
	//��ӡ���ＶĿ¼���ļ�������
	public static void printName(File src,int deep) {//deep����ڼ��㣬�м����ӡ����-
		//���Ʋ��
		for (int i = 0; i < deep; i++) {
			System.out.print("-");
		}
		//��ӡ����
		System.out.println(src.getName());
		if (null == src || !src.exists()) {//�ݹ�ͷ
			return;
		}else if (src.isDirectory()) {//Ŀ¼
			for (File s:src.listFiles()) {//listFiles()������ĳ��Ŀ¼�������ļ���Ŀ¼�ľ���·�������ص���File����
				printName(s, deep+1);//�ݹ���
			}
		}
	}

}
