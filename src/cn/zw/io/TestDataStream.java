package cn.zw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 【示例10-10】DataInputStream和DataOutputStream的使用
 *  DataInputStream和DataOutputStream是处理流，可以对其他节点流或处理流进行包装，增加一些更灵活、更高效的功能。
 *
 */
public class TestDataStream {
	public static void main(String[] args) {
		DataInputStream dis = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("D:/data.txt");
			fos = new FileOutputStream("D:/data.txt");
			//使用数据流对缓冲流进行包装，新增缓冲功能
			dis = new DataInputStream(new BufferedInputStream(fis));
			dos = new DataOutputStream(new BufferedOutputStream(fos));
			//将如下数据写入到文件中
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			dos.writeUTF("钟微");
			//手动刷新缓冲区：将流中数据写道文件中
			dos.flush();
			//直接读取数据：读取的顺序要与写入的顺序一致，否则不能正确读取数据。
			System.out.println("char: " + dis.readChar());
            System.out.println("int: " + dis.readInt());
            System.out.println("double: " + dis.readDouble());
            System.out.println("boolean: " + dis.readBoolean());
            System.out.println("String: " + dis.readUTF());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流

			try {
				if (dos != null) {
					dos.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				if (dis != null) {
					dis.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

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
