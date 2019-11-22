package cn.zw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;

/*
 * ��ʾ��12-8��TCP������ͨ��Socket֮�ͻ���
 */

public class BasicSocketClient {
	public static void main(String[] args) {
		Socket socket = null;
		BufferedReader br = null;
		try {
			/**
			 * ����socket����ָ��Ҫ���ӵķ�������IP�Ͷ˿ڶ������Լ�������
			 * �˿ڡ����Ͷ˿��������
			 */
			socket = new Socket(InetAddress.getLocalHost(),8888);
			//��ȡsocket������������ʹ�û��������а�װ
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//���շ������˷��͵���Ϣ
			System.out.println(br.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			//�ر�����socket����
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
