package cn.zw.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���������ң���������
 * Ŀ�꣺ʵ��һ���ͻ����������շ���Ϣ
 * @author Administrator
 *
 */
public class Chat01_Chat {
	public static void main(String[] args) throws Exception {
		System.out.println("-----Server----");
		
		//1��ָ���˿ڣ�ʹ��ServerSocket����������
		ServerSocket server = new ServerSocket(8888);
		
		//2������ʽ�ȴ�����accept
		Socket clien = server.accept();
		System.out.println("һ���ͻ��˽���������");
		
		//3��������Ϣ
		DataInputStream dis = new DataInputStream(clien.getInputStream());//����: �������������
		String msg = dis.readUTF();
		//4��������Ϣ
		DataOutputStream dos = new DataOutputStream(clien.getOutputStream());
		dos.writeUTF(msg);
		//�ͷ���Դ
		dos.flush();//��ջ���������
		dos.close();
		dis.close();
		clien.close();
		
	}
}
