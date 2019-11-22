package cn.zw.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ��ʾ��12-11��TCP��������֮��������
 */
public class ChatServer {
	public static void main(String[] args) {
			ServerSocket sever = null;
			Socket socket = null;
			BufferedReader in = null;
			try {
				sever = new ServerSocket(8888);
				socket = sever.accept();
				//������ͻ��˷�����Ϣ���̣߳�������
				new ServerThread(socket).start();
				//main�̸߳��ƶ�ȡ�ͻ��˷�������Ϣ
				in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				while (true) {
					String str = in.readLine();
					System.out.println("�ͻ�˵��"+str);
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
 * ר����ͻ��˷�����Ϣ���߳�
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