package cn.zw.io;
/*
 * ����Ŀ¼
 * mkdir():��һ��Ŀ¼��������Դ���
 * mkdirs()��������һ��Ŀ¼�Ƿ���ڶ����Դ����ɹ�
 */

import java.io.File;

public class DirDemo01 {
	public static void main(String[] args) {
		File dir = new File("D:/eclipse-workspace/zw_java_study/dir/test");
		//����Ŀ¼
		boolean flag = dir.mkdir();//��Ϊ������dirĿ¼���Դ���test�ļ�ʧ��
		System.out.println(flag);
		
		flag = dir.mkdirs();
		System.out.println(flag);
	
		
		
	}

}
