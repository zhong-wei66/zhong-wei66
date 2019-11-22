package cn.zw.net;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 12.3.4 ����TCPЭ���Socket��̺�ͨ��
 * ��ʾ��12-7��TCP������ͨ��Socket֮��������
 * @author Administrator
 *
 */

public class BasicSocketServer {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedWriter bw = null;
		try {
			//�������������׽��֣�ָ�������Ķ˿�
			ServerSocket serverSocket = new ServerSocket(8888);
			System.out.println("����˽�������");
			//�������ȴ��ͻ������󣬲�Ը���������
			socket = serverSocket.accept();
			//��ȡsocked�����������ʹ�û��������а�װ
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//��ͻ��˷��ͷ�����Ϣ
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
