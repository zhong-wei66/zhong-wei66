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
			//����socket����ָ���������˵�IP��˿�
			socket = new Socket(InetAddress.getLocalHost(),8888);
			System.out.println("client����server�ɹ�");
			//��ȡsocket��������������պͷ�����Ϣ
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			wt = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				//������Ϣ
				String str = wt.readLine();
				out.write(str + "\n");
				out.flush();
				//�������� ��ϢΪ��end������ֹ����
				if (str.equals("end")) {
					break;
				}
				//���򣬽��ղ��������������Ϣ
				System.out.println("������˵��"+in.readLine());
			}
			
		} catch (UnknownHostException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			// �ر���Դ
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
