package cn.zw.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;

import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;


/**
* 在线聊天室: 客户端
* 目标: 实现一个客户可以正常收发消息
*/
public class Client01 {
	public static void main(String[] args) throws Exception {
		System.out.println("----客户端----");
		//1、建立连接
		Socket client = new Socket(InetAddress.getLocalHost(),8888);
		//2、客户端发送消息
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String msg = console.readLine();
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();
		//3、接收消息
		DataInputStream dis = new DataInputStream(client.getInputStream());
		msg = dis.readUTF();
//		System.out.println(msg);
		
		dos.close();
		dis.close();
		client.close();
	
	}
}
