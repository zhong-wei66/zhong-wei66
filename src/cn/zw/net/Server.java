package cn.zw.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * ��ʾ��12-9��TCP��˫��ͨ��Socket֮��������
 */
public class Server {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader in = null;
		BufferedWriter out = null;
		BufferedReader br = null;
		try {
			//�������������׽��֣�ָ�������Ķ˿�
			ServerSocket sever = new ServerSocket(8888);
			System.out.println("server����");
			//�����ͻ��˵�����
			socket = sever.accept();
			
			//��ȡsocket��������������պͷ�����Ϣ
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				//���տͻ��˷��͵���Ϣ
				String str = in.readLine();
				System.out.println("�ͻ�˵��"+str);
				String str2 = "";
				if (str.equals("end")) {
					break;
				}
				//���򣬷��ͷ�����Ϣ
				str2 = br.readLine();//����\nΪֹ����˱����л��з�
				out.write(str2 + "\n");
				out.flush();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//�ر���Դ
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
