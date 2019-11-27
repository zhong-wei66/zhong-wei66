package cn.zw.net.chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 在线聊天室：客户端
 * 目标：实现一个客户可以正常收发消息
 * @author Administrator
 *
 */
public class Chat01_Client {
	public static void main(String[] args) throws Exception {
		System.out.println("----Client----");
		
		//1、建立连接：使用Socket创建客户端+服务器的地址和端口
		Socket client = new Socket("localhost",8888);
		
		//2、客户端发送消息
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));//获取控制台输入
		String msg = console.readLine();//读取控制台输入的信息
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());//操作: 输入输出流操作
		dos.writeUTF(msg);
		dos.flush();//清空缓冲区数据
		//3、获取消息
		DataInputStream dis = new DataInputStream(client.getInputStream());
		msg = dis.readUTF();
		System.out.println(msg);
		//4、释放资源
		dos.close();
		dis.close();
		client.close();
	}
}
