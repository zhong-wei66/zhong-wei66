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
		//使用getLocalHost方法创建InetAddress对象
		InetAddress addr = InetAddress.getLocalHost();
		//返回IP地址192.168.41.1
		System.out.println(addr.getHostAddress());
		//输出计算机名字DESKTOP-RV9FIIG
		System.out.println(addr.getHostName());
		
		//根据域名得到InetAddress对象
		addr = InetAddress.getByName("www.sxt.cn");
		//返回sxt服务器的IP:59.110.14.7
		System.out.println(addr.getHostAddress());
		//输出www.sxt.cn
		System.out.println(addr.getHostName());
		
		//根据IP得到InetAddress对象
		addr = InetAddress.getByName("59.110.14.7");
		//返回服务器的IP：59.110.14.7
		System.out.println(addr.getHostAddress());
		System.out.println("---------");
		System.out.println(addr.getHostName());
		addr = InetAddress.getByName("www.sxt.cn");
		System.out.println(addr.getHostName());
	}	
}
