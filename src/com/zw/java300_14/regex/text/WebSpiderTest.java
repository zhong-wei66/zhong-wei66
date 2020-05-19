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
 * 网络爬虫取链接
 * @author Administrator
 *
 */
public class WebSpiderTest {
	//获得urlStr对应的网页的源码内容
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
		Pattern p = Pattern.compile("href=\"(.+?)\""); //渠道超链接的地址
		Matcher m = p.matcher(destStr);
		List<String> result = new ArrayList<String>();
		while (m.find()) {
			result.add(m.group(1));
		}
		return result;
	}
	
	public static void main(String[] args) {
		String destStr = getURLContent("http://www.163.com","gbk");
		
//		Pattern p = Pattern.compile("<a[\\s\\S]+?</a>"); //取到超链接的整个内容
		//  \w任意一个字母或数字下划线，A-Z,a-z,0-9中任意一个
		//  \s包括空格、制表符、换行符等空白字符的其中任意一个
		//  .匹配任意一个字符（除了换行符）
		//  /:
		//  +表达式至少出现一次
		//  ?匹配表达式0次或者1次，相当于{0,1}
		List<String> result = getMatherSubstrs(destStr, "href=\"([\\w\\s./:]+?)\"");
		for (String temp : result) {
			System.out.println(temp);
		}
	}
}
