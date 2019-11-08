package cn.zw.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * ��ʾ��10-10��DataInputStream��DataOutputStream��ʹ��
 *  DataInputStream��DataOutputStream�Ǵ����������Զ������ڵ������������а�װ������һЩ��������Ч�Ĺ��ܡ�
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
			//ʹ���������Ի��������а�װ���������幦��
			dis = new DataInputStream(new BufferedInputStream(fis));
			dos = new DataOutputStream(new BufferedOutputStream(fos));
			//����������д�뵽�ļ���
			dos.writeChar('a');
			dos.writeInt(10);
			dos.writeDouble(Math.random());
			dos.writeBoolean(true);
			dos.writeUTF("��΢");
			//�ֶ�ˢ�»�����������������д���ļ���
			dos.flush();
			//ֱ�Ӷ�ȡ���ݣ���ȡ��˳��Ҫ��д���˳��һ�£���������ȷ��ȡ���ݡ�
			System.out.println("char: " + dis.readChar());
            System.out.println("int: " + dis.readInt());
            System.out.println("double: " + dis.readDouble());
            System.out.println("boolean: " + dis.readBoolean());
            System.out.println("String: " + dis.readUTF());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر���

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
