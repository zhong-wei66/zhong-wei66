package cn.zw.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 【示例10-5】利用文件流实现文件的复制
 * @author Administrator
 *
 */

public class TestFileCopy {
	public static void main(String[] args) {
		copyFile("d:/a.txt", "d:/b.txt");
		
	}
	
	/**
	 * 将src文件的内容拷贝到dec文件
	 * src 源文件
	 * dec目标文件
	 */
	
	static void copyFile(String src,String dec) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//为了提高效率，设置缓存数组！（读取的字节数据会暂存放到该字节数组中）
		byte[] buffer = new byte[1024];//定义一个byte类型的数组，数组长度是1024
		int temp = 0;
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream(dec);
			//边读边写
			//temp值得是本次读取的真实长度，temp等于-1时，表示读取结束
			while ((temp = fis.read(buffer))!=-1) {
				/**
				 * 将缓存数组中的数据写入文件中，注意：写入的时读取的真实长度
				 * 如果使用fis.read(buffer)方法，那么写入的长度将是10224，即缓存数组的长度
				 */
				fos.write(buffer,0,temp);
				
			}
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//两个流需要关闭
			try {
				if (fos != null) {
					fos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
