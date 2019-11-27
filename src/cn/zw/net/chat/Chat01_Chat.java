package cn.zw.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 在线聊天室：服务器端
 * 目标：实现一个客户可以正常收发信息
 * @author Administrator
 *
 */
public class Chat01_Chat {
	public static void main(String[] args) throws Exception {
		System.out.println("-----Server----");
		
		//1、指定端口，使用ServerSocket创建服务器
		ServerSocket server = new ServerSocket(8888);
		
		//2、阻塞式等待连接accept
		Socket clien = server.accept();
		System.out.println("一个客户端建立了连接");
		
		//3、接收消息
		DataInputStream dis = new DataInputStream(clien.getInputStream());//操作: 输入输出流操作
		String msg = dis.readUTF();
		//4、返回消息
		DataOutputStream dos = new DataOutputStream(clien.getOutputStream());
		dos.writeUTF(msg);
		//释放资源
		dos.flush();//清空缓冲区数据
		dos.close();
		dis.close();
		clien.close();
		
	}
}
