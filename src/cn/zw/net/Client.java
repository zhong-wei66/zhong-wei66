package cn.zw.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		BufferedReader wt = null;
		try {
			//创建socket对象，指定服务器端的IP与端口
			socket = new Socket(InetAddress.getLocalHost(),8888);
			System.out.println("client连接server成功");
			//获取socket的输入输出流接收和发送信息
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			wt = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				//发送消息
				String str = wt.readLine();
				out.write(str + "\n");
				out.flush();
				//如果输入的 信息为“end”则终止连接
				if (str.equals("end")) {
					break;
				}
				//否则，接收并输出服务器端信息
				System.out.println("服务器说："+in.readLine());
			}
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// 关闭资源
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (wt != null) {
                try {
                    wt.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }   
		}
            
	} 
}
