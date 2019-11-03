package cn.zw.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Test01 {
	
	public static void main(String[] args){
		try {
			FileReader reader=new FileReader("d:/a.txt");
			
			char c1;
			c1 = (char)reader.read();
			
			System.out.println(c1);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//reader.close();
		}
	}

}
