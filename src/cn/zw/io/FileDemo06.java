package cn.zw.io;

import java.io.File;
import java.io.IOException;

/**
 * 其他信息：
 * createNewFile():不存在才创建，创建成功返回true，已存在不会重复创建，返回false
 * delete():删除已经存在的文件
 * 
 */
public class FileDemo06 {
	public static void main(String[] args) throws IOException {
		File src = new File("D:/eclipse-workspace/zw_java_study/images/io.txt");
		boolean flag = src.createNewFile();//createNewFile()有时会失败
		System.out.println(flag);//查看文件是否创建成功
		//删除
		flag=src.delete();
		System.out.println(flag);
		
		System.out.println("-----------");
		
		//不是文件夹
		src = new File("D:/eclipse-workspace/zw_java_study/images2");
		flag = src.createNewFile();//createNewFile()有时会失败
		System.out.println(flag);//查看文件是否创建成功
		//删除
		flag=src.delete();
		System.out.println(flag);
		
		
		//补充con、con3是操作系统的设备名，不能正确创建
		src = new File("D:/eclipse-workspace/zw_java_study/con");
		flag = src.createNewFile();//createNewFile()有时会失败
		System.out.println(flag);
		
	}

}
