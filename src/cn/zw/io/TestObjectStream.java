package cn.zw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Date;
/**
 * 10.2.7对象流
 * 【示例10-11】ObjectInputStream/ObjectOutputStream的使用
 * @author Administrator
 *
 */

public class TestObjectStream {
	public static void main(String[] args) {
		write();
		read();
	}
	
	//使用对象输出流将数据写入文件
	public static void write() {
		//创建object输出流，并包装输出流，增加缓冲功能
		OutputStream os = null;//字节输出流的所有类的父类
		BufferedOutputStream bos = null;//缓冲输出流，通过内部缓存数组来提高操作流的效率
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(new File("d:/data.txt"));
			bos = new BufferedOutputStream(os);
			oos = new ObjectOutputStream(bos);
			
			//使用object输出流
			//对象流也可以对基本数据类型进行读写操作
			oos.writeInt(12);
			oos.writeDouble(3.14);
			oos.writeChar('A');
			oos.writeBoolean(true);
			oos.writeUTF("张三");
			
			//对象流能够对对象数据类型进行读写操作
			//Date是系统提供的类，已经实现了序列化接口
			//吐过自定义类，则需要自己实现序列化接口
			oos.writeObject(new Date());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭输出流
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (os != null) {
				try {
					os.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
	//使用对象流输入数据读入程序
	private static void read() {
		//创建object输入流按照写入顺序读取
		InputStream is = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(new File("d:/data.txt"));
			bis = new BufferedInputStream(is);
			ois = new ObjectInputStream(bis);
			//使用object输入流按照写入顺序读取
			System.out.println(ois.readInt());
			System.out.println(ois.readDouble());
			System.out.println(ois.readChar());
			System.out.println(ois.readBoolean());
			System.out.println(ois.readUTF());
			System.out.println(ois.readObject().toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流
			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (bis != null) {
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (is != null) {
				try {
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}
		
		
	}
	
}
