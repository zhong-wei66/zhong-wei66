package cn.zw.io;

import java.io.File;

/*
 * ͳ���ļ��еĴ�С
 * 
 */



public class DirDemo05 {
	public static void main(String[] args) {
		File src = new File("D:/eclipse-workspace/zw_java_study");
		count(src);
		System.out.println(len);
	}
	private static long len = 0;
	//��ӡ���ＶĿ¼���ļ�������
	public static void count(File src) {//deep����ڼ��㣬�м����ӡ����-
		
		//��ȡ��С
		if (src != null && src.exists()) {//src != null:·����Ϊ�գ�src.exists()���ļ�·���Ƿ����
			if (src.isFile()) {//��С
				len += src.length();
			}else {//���Ｖ
				for (File s:src.listFiles()) {
					count(s);
				}
			}
		}
	}	
	
}
