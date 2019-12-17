package com.server.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.events.EndDocument;
import javax.xml.stream.events.StartDocument;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * 熟悉SAX解析流程
 */
public class XmlTest02 {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		//SAX解析
				//1、获取解析工厂
				SAXParserFactory factory = SAXParserFactory.newInstance();
				//2、从解析工厂获取解析器
				SAXParser parse = factory.newSAXParser();
				//3、编写处理器
				//4、加载文档 Document 注册处理器
				PersonHandler handler = new PersonHandler();
				//5、解析
				parse.parse(Thread.currentThread().getContextClassLoader().
						getResourceAsStream("com/server/basic/p.xml"),handler);
				//获取数据
				List<Person> persons = handler.getPersons();
				for (Person p : persons) {
					System.out.println(p.getName()+"--->"+p.getAge());
				}

	}

}

class PersonHandler extends DefaultHandler{
	private List<Person> persons;
	private Person person;
	private String tag;//存储操作标签
	@Override
	public void startDocument() throws SAXException {
//		System.out.println("----解析文档开始----");
		persons = new ArrayList<Person>();
	}
	
		
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName+"-->解析开始");
		if (null != qName) {
			tag = qName;//存储标签名
			if (tag.equals("person")) {
				person = new Person();//初始化
			}
		}
		
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch,start,length).trim();
//		if (contents.length()>0) {
//			System.out.println("内容为："+contents);
//		}else {
//			System.out.println("内容为:--->"+"空");
//		}
		
		if (null!=tag) {//处理了空
			if (tag.equals("name")) {
				person.setName(contents);
			}else if (tag.equals("age")) {
				if (contents.length() > 0) {
					person.setAge(Integer.valueOf(contents));	
				}
			}
		}
		
	}
		
		
		public void endElement(String uri, String localName, String qName) throws SAXException{
			System.out.println(qName+"-->解析结束");
			if (null!=qName) {
				if (qName.equals("person")) {
					persons.add(person);//加入容器
				}
			}
			
			tag = null;//tag丢弃了
		}
		
		public void endDocument() throws SAXException {
//			System.out.println("----解析文档结束----");
		}


		public List<Person> getPersons() {
			return persons;
		}		
	
}