package cn.zw.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


/**
* ����������: �ͻ���
* Ŀ��: ʵ��һ���ͻ����������շ���Ϣ
*/
public class Client01 {
	public static void main(String[] args) throws Exception {
		System.out.println("----�ͻ���----");
		//1����������
		Socket client = new Socket(InetAddress.getLocalHost(),8888);
		//2���ͻ��˷�����Ϣ
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String msg = console.readLine();
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//3��������Ϣ
		DataInputStream dis = new DataInputStream(client.getInputStream());
		msg = dis.readUTF();
//		System.out.println(msg);
		
		dos.close();
		dis.close();
		client.close();
	
	}
}
