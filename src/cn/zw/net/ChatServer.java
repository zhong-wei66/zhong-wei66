package cn.zw.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 【示例12-11】TCP：聊天室之服务器端
 */
public class ChatServer {
	public static void main(String[] args) {
			ServerSocket sever = null;
			Socket socket = null;
			BufferedReader in = null;
			try {
				sever = new ServerSocket(8888);
				socket = sever.accept();
				//创建向客户端发送消息的线程，并启动
				new ServerThread(socket).start();
				//main线程复制读取客户端发来的信息
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {
					String str = in.readLine();
					System.out.println("客户说："+str);
				}
				
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally {
				try {
					if (in != null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
				try {
					if (socket != null) {
						socket.close();
					}
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				
			}
			
	} 
}

/**
 * 专门向客户端发送消息的线程
 */
class ServerThread extends Thread {
	Socket ss;
	BufferedReader br;
	BufferedWriter out;

	public ServerThread(Socket ss) {
		super();
		this.ss = ss;
		try {
			out = new BufferedWriter(new OutputStreamWriter(ss.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				String str2 = br.readLine();
				out.write(str2 + "\n");
				out.flush();
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
	}

}