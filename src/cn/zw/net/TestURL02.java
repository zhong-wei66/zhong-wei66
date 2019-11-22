package cn.zw.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class TestURL02 {
	public static void main(String[] args) {
		basicSpider();
	}
	static void basicSpider() {
		URL url = null;
		InputStream is = null;
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String temp = "";
		try {
			url = new URL("http://www.baidu.com");
			is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
			/* 
			 * 这样就可以将网络内容下载到本地机器。
			 * 然后进行数据分析，建立索引。这也是搜索引擎的第一步。
             */
			while ((temp = br.readLine()) != null) {
				sb.append(temp);
				
			}
			System.out.println(sb);
		} catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				is.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
