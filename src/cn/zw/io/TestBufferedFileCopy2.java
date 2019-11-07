package cn.zw.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 【示例10-8】使用BufferedReader与BufferedWriter实现文本文件的复制
 * @author Administrator
 *
 */
public class TestBufferedFileCopy2 {
	public static void main(String[] args) {
		//处理文本文件时，实际开发中可以加用如下写法，简单高效
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String  tempString = "";
		try {
			fr = new FileReader("d:/a.txt");
			fw = new FileWriter("d:/d.txt");
			//使用缓冲字符流进行包装
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			//BufferedReader提供了更方便的readLine()方法，直接按行读取文本
            //br.readLine()方法的返回值是一个字符串对象，即文本中的一行内容
            while ((tempString = br.readLine()) != null) {
				//将读取的一行字符串写入文件中
            	bw.write(tempString);
				//下次写入前先换行
            	bw.newLine();
            	
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (bw != null) {
					bw.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			try {
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			
		}
		
	}
}
