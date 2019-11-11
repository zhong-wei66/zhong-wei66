package cn.zw.io;

import java.io.File;

/*
 * ʹ���������ͳ���ļ��еĴ�С
 * 
 */


public class DirCount {
	//��С
	private long len;
	//�ļ���·��
	private String path;
	//�ļ�����
	private int fileSize;
	//�ļ��и���
	private int dirSize;
	//Դ
	private File src;
	
	//������
	public DirCount(String path) {
		super();
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}


	
	//ͳ�ƴ�С
	private void count(File src) {//deep����ڼ��㣬�м����ӡ����-
		
		//��ȡ��С
		if (src != null && src.exists()) {//src != null:·����Ϊ�գ�src.exists()���ļ�·���Ƿ����
			if (src.isFile()) {//��С
				len += src.length();
				this.fileSize++;
			}else {//���Ｖ
				this.dirSize++;
				for (File s:src.listFiles()) {
					count(s);
				}
			}
		}
	}

	
	public long getLen() {
		return len;
	}

	public int getFileSize() {
		return fileSize;
	}
	
	public int getDirSize() {
		return dirSize;
	}
	
	public static void main(String[] args) {
		DirCount dir = new DirCount("D:/eclipse-workspace/zw_java_study");
		System.out.println(dir.getLen()+"---->"+dir.getDirSize()+"---->"+dir.getFileSize());
		
		DirCount dir2 = new DirCount("D:/eclipse-workspace/zw_java_study/src");
		System.out.println(dir2.getLen()+"---->"+dir2.getDirSize()+"---->"+dir2.getFileSize());
		
	}
			
}
