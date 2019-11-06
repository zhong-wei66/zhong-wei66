package cn.zw.io;

import java.io.FileInputStream;

/**
 * 【示例10-2】使用流读取文件内容(经典代码，一定要掌握)
 * @author Administrator
 *
 */

public class TestIO2 {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("d:/a.txt");//内容是abc
			StringBuilder sb = new StringBuilder();
			int temp = 0;
			//当temp等于-1时，表示已经到了文件结尾，停止读取
			while ((temp = fis.read())!=-1) {
				sb.append((char)temp);
				
			}
			System.out.println(sb);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//这种写法，保证了即使遇见异常情况，也会关闭流对象
				while (fis != null) {
					fis.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
