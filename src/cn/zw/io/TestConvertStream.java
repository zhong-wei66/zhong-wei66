package cn.zw.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.zip.InflaterInputStream;

/**
 * 10.2.8 转换流
 * 【示例10-12】使用InputStreamReader接收用户的输入，并输出到控制台
 * 
 */

public class TestConvertStream {
	// InputStreamReader/OutputStreamWriter实现将字节流转化成字符流
	public static void main(String[] args) {
		//创建字符输入流和输出流：使用转换流将字节流转换成字符流
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new OutputStreamWriter(System.out));//OutputStreamWriter将字节流转化为字符流
			//使用字符输入和输出流
			String str = br.readLine();//readLine()读取流读数据的时候用，同时会以字符串形式返回这一行的数据，当读取完所有的数据时会返回null。
			//一直读取，知道用户输入exit为止
			while (!"exit".equals(str)) {
				//写道控制台
				bw.write(str);
				bw.newLine();//写一行后换一行
				bw.flush();//手动刷新
				//再续写一行
				str = br.readLine();
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流
			if (bw != null) {
				try {
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
