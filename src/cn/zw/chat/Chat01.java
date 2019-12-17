package cn.zw.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.attribute.DosFileAttributes;

/**
 * ����������: ������
 * Ŀ��: ʵ��һ���ͻ����������շ���Ϣ
 * @author Administrator
 *
 */
public class Chat01 {
	public static void main(String[] args) throws IOException {
		System.out.println("----��������----");
		//1��ָ���˿ڣ�ʹ��ServerSocket����������
		ServerSocket server = new ServerSocket(8888);
		//2������ʽ�ȴ�����accept
		Socket client = server.accept();
		System.out.println("һ���ͻ��˽���������");
		//3��������Ϣ
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg = dis.readUTF();
		System.out.println("�ͻ���˵��"+msg);
		//4��������Ϣ
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		//�ͷ���Դ
		dos.flush();
		dos.close();
		dis.close();
		client.close();
		
	}
}
