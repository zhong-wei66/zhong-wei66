package cn.zw.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 【示例12-9】TCP：双向通信Socket之服务器端
 */
public class Server {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		BufferedReader br = null;
		try {
			//创建服务器端套接字：指定监听的端口
			ServerSocket sever = new ServerSocket(8888);
			System.out.println("server启动");
			//监听客户端的连接
			socket = sever.accept();
			
			//获取socket的输入输出流接收和发送信息
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				//接收客户端发送的信息
				String str = in.readLine();
				System.out.println("客户说："+str);
				String str2 = "";
				if (str.equals("end")) {
					break;
				}
				//否则，发送反馈信息
				str2 = br.readLine();//读到\n为止，因此必须有换行符
				out.write(str2 + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//关闭资源
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (br != null) {
				try {
					br.close();
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
