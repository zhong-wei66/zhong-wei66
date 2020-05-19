package com.zw.java300_14.regex.text;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ��������ȡ����
 * @author Administrator
 *
 */
public class WebSpiderTest {
	//���urlStr��Ӧ����ҳ��Դ������
	public static String getURLContent(String urlStr,String charset){
		StringBuilder sb = new StringBuilder();
		
		try {
			URL url = new URL(urlStr);
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(),charset));
			String temp ="";
			while ((temp=reader.readLine())!=null) {
				sb.append(temp);
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sb.toString();
	}
	
	public static List<String> getMatherSubstrs(String destStr,String regexStr){
		Pattern p = Pattern.compile("href=\"(.+?)\""); //���������ӵĵ�ַ
		Matcher m = p.matcher(destStr);
		List<String> result = new ArrayList<String>();
		while (m.find()) {
			result.add(m.group(1));
		}
		return result;
	}
	
	public static void main(String[] args) {
		String destStr = getURLContent("http://www.163.com","gbk");
		
//		Pattern p = Pattern.compile("<a[\\s\\S]+?</a>"); //ȡ�������ӵ���������
		//  \w����һ����ĸ�������»��ߣ�A-Z,a-z,0-9������һ��
		//  \s�����ո��Ʊ�������з��ȿհ��ַ�����������һ��
		//  .ƥ������һ���ַ������˻��з���
		//  /:
		//  +���ʽ���ٳ���һ��
		//  ?ƥ����ʽ0�λ���1�Σ��൱��{0,1}
		List<String> result = getMatherSubstrs(destStr, "href=\"([\\w\\s./:]+?)\"");
		for (String temp : result) {
			System.out.println(temp);
		}
	}
}
