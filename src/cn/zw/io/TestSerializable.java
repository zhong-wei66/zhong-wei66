package cn.zw.io;
/**
 * 10.3.3 序列化/反序列化的步骤和实例
 * 【示例10-14】将Person类的实例进行序列化和反序列化
 * @author Administrator
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Person类实现Serializable接口后，Person对象才能被序列化
//只有实现了Serializable接口的类的对象才能被序列化。 Serializable接口是一个空接口，只起到标记作用。
class Person implements Serializable{
	//添加序列化ID，它决定着是否能够成功反序列化
	private static final long serialVersionUID = 1L;
	int age;
	boolean isMan;
	String name;
	public Person(int age, boolean isMan, String name) {
		super();
		this.age = age;
		this.isMan = isMan;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return "Person [age="+age+" ,isMan="+isMan+" ,name="+name+"]";
	}
	
	
}
public class TestSerializable {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			//通过ObjectOutputStream将Person对象的数据写到文件中，即序列化
			Person person = new Person(18, true, "张三");
			//序列化
			fos = new FileOutputStream("d:/c.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(person);//writeObject(Object obj)方法可对参数指定的obj对象进行序列化，把得到的字节序列写到一个目标输出流中。
			oos.flush();
			
			//反序列化
			fis = new FileInputStream("d:/c.txt");
			//通过ObjectInputStream将文件中二进制数据反序列化成Person对象
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();//readObject()方法从一个源输入流中读取字节序列，再把它们反序列化为一个对象，并将其返回。
			System.out.println(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭流
			if (oos != null) {
				try {
					oos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}

			if (ois != null) {
				try {
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			

			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		}
		
	}
}
