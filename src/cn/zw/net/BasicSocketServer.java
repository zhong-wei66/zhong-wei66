package cn.zw.net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 12.3.4 基于TCP协议的Socket编程和通信
 * 【示例12-7】TCP：单向通信Socket之服务器端
 * @author Administrator
 *
 */

public class BasicSocketServer {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			//建立服务器端套接字：指定监听的端口
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("服务端建立监听");
			//监听，等待客户端请求，并愿意接收连接
			socket = serverSocket.accept();
			//获取socked的输出流，并使用缓冲流进行包装
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//向客户端发送发聩信息
			bw.write("hhh");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			if (bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
	}
}
