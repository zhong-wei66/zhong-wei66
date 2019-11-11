package cn.zw.io;

import java.io.File;

/*
 * 使用面向对象：统计文件夹的大小
 * 
 */


public class DirCount {
	//大小
	private long len;
	//文件夹路径
	private String path;
	//文件个数
	private int fileSize;
	//文件夹个数
	private int dirSize;
	//源
	private File src;
	
	//构造器
	public DirCount(String path) {
		super();
		this.path = path;
		this.src = new File(path);
		count(this.src);
	}


	
	//统计大小
	private void count(File src) {//deep代表第几层，有几层打印几个-
		
		//获取大小
		if (src != null && src.exists()) {//src != null:路径不为空，src.exists()：文件路径是否存在
			if (src.isFile()) {//大小
				len += src.length();
				this.fileSize++;
			}else {//子孙级
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
