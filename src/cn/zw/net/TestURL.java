package cn.zw.net;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class TestURL {
	public static void main(String[] args) throws MalformedURLException {
		URL u = new URL("http://www.google.cn:80/webhp#aa?canhu=33");
		System.out.println("��ȡ���url������Э���Ĭ�϶˿�:"+u.getDefaultPort());
		System.out.println("getFile:" + u.getFile()); // �˿ںź��������
        System.out.println("��������" + u.getHost()); // www.google.cn
        System.out.println("·����" + u.getPath()); // �˿ںź󣬲���ǰ������
        // ���www.google.cn:80�򷵻�80.���򷵻�-1
        System.out.println("�˿ڣ�" + u.getPort()); 
        System.out.println("Э�飺" + u.getProtocol());
        System.out.println("�������֣�" + u.getQuery());
        System.out.println("ê�㣺" + u.getRef());
        
        System.out.println("------------");
        URL u1 = new URL("http://www.abc.com/aa/");
        URL u2 = new URL(u1, "2.html"); // ���·������url����
        System.out.println(u2.toString()); // http://www.abc.com/aa/2.html
	}
}
