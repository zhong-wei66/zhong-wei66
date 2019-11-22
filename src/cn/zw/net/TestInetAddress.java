package cn.zw.net;
/**
 * IP:
 * @author Administrator
 *
 */

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestInetAddress {
	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����
		InetAddress addr = InetAddress.getLocalHost();
		//����IP��ַ192.168.41.1
		System.out.println(addr.getHostAddress());
		//������������DESKTOP-RV9FIIG
		System.out.println(addr.getHostName());
		
		//���������õ�InetAddress����
		addr = InetAddress.getByName("www.sxt.cn");
		//����sxt��������IP:59.110.14.7
		System.out.println(addr.getHostAddress());
		//���www.sxt.cn
		System.out.println(addr.getHostName());
		
		//����IP�õ�InetAddress����
		addr = InetAddress.getByName("59.110.14.7");
		//���ط�������IP��59.110.14.7
		System.out.println(addr.getHostAddress());
		System.out.println("---------");
		System.out.println(addr.getHostName());
		addr = InetAddress.getByName("www.sxt.cn");
		System.out.println(addr.getHostName());
	}	
}
