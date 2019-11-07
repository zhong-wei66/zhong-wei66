package cn.zw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;

/**
 * 【示例10-7】使用缓冲流实现文件的高效率复制
 * @author Administrator
 *
 */

public class TestBufferedFileCopy1 {
	public static void main(String[] args) {
		//使用缓冲字节流实现复制
		long time1 = System.currentTimeMillis();
		copyFile1("D:/音乐/贝贝_李荣浩_128K.mp3", "D:/音乐/新建文件夹"+"贝贝_李荣浩_128K.mp3");
		long time2 = System.currentTimeMillis();
		System.out.println("缓冲字节流花费的时间为：" + (time2 - time1));
		
		//使用普通字节流进行复制
		long time3 = System.currentTimeMillis();
		copyFile2("D:/音乐/贝贝_李荣浩_128K.mp3", "D:/音乐/新建文件夹"+"贝贝_李荣浩_128K.mp3");
		long time4 = System.currentTimeMillis();
		System.out.println("普通字节流花费的时间为：" + (time4 - time3));
		
	}

	//缓存字节流实现的文件复制方法
	static void copyFile1(String src,String dec) {
		FileInputStream fis = null;//文件字节流
		BufferedInputStream bis = null;//缓冲字节流
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		int temp = 0;
		try {
			fis =new FileInputStream(src);
			fos = new FileOutputStream(dec);
			//使用缓冲字节流包装文件字节流，增加缓冲功能，提高效率
			//缓存区域大小（缓存数组的长度）默认是8192，也可以自己指定大小
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			while ((temp = bis.read())!=-1) {
				bos.write(temp);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//注意：增加处理流后，注意流的关闭顺序！“后开的先关闭”
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (bis != null) {
					bis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
	//普通节流实现的文件复制方法
	static void copyFile2(String src,String dec) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			while ((temp = fis.read()) != -1) {
				fos.write(temp);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流
			try {
				if (fos != null) {
					fos.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if (fis != null) {
					fis.close();
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
}

