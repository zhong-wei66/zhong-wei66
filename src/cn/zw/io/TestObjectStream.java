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
 * 10.2.7������
 * ��ʾ��10-11��ObjectInputStream/ObjectOutputStream��ʹ��
 * @author Administrator
 *
 */

public class TestObjectStream {
	public static void main(String[] args) {
		write();
		read();
	}
	
	//ʹ�ö��������������д���ļ�
	public static void write() {
		//����object�����������װ����������ӻ��幦��
		OutputStream os = null;//�ֽ��������������ĸ���
		BufferedOutputStream bos = null;//�����������ͨ���ڲ�������������߲�������Ч��
		ObjectOutputStream oos = null;
		
		try {
			os = new FileOutputStream(new File("d:/data.txt"));
			bos = new BufferedOutputStream(os);
			oos = new ObjectOutputStream(bos);
			
			//ʹ��object�����
			//������Ҳ���ԶԻ����������ͽ��ж�д����
			oos.writeInt(12);
			oos.writeDouble(3.14);
			oos.writeChar('A');
			oos.writeBoolean(true);
			oos.writeUTF("����");
			
			//�������ܹ��Զ����������ͽ��ж�д����
			//Date��ϵͳ�ṩ���࣬�Ѿ�ʵ�������л��ӿ�
			//�¹��Զ����࣬����Ҫ�Լ�ʵ�����л��ӿ�
			oos.writeObject(new Date());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر������
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
	
	//ʹ�ö������������ݶ������
	private static void read() {
		//����object����������д��˳���ȡ
		InputStream is = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			is = new FileInputStream(new File("d:/data.txt"));
			bis = new BufferedInputStream(is);
			ois = new ObjectInputStream(bis);
			//ʹ��object����������д��˳���ȡ
			System.out.println(ois.readInt());
			System.out.println(ois.readDouble());
			System.out.println(ois.readChar());
			System.out.println(ois.readBoolean());
			System.out.println(ois.readUTF());
			System.out.println(ois.readObject().toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر���
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
