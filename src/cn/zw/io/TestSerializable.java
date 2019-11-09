package cn.zw.io;
/**
 * 10.3.3 ���л�/�����л��Ĳ����ʵ��
 * ��ʾ��10-14����Person���ʵ���������л��ͷ����л�
 * @author Administrator
 *
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Person��ʵ��Serializable�ӿں�Person������ܱ����л�
//ֻ��ʵ����Serializable�ӿڵ���Ķ�����ܱ����л��� Serializable�ӿ���һ���սӿڣ�ֻ�𵽱�����á�
class Person implements Serializable{
	//������л�ID�����������Ƿ��ܹ��ɹ������л�
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
			//ͨ��ObjectOutputStream��Person���������д���ļ��У������л�
			Person person = new Person(18, true, "����");
			//���л�
			fos = new FileOutputStream("d:/c.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(person);//writeObject(Object obj)�����ɶԲ���ָ����obj����������л����ѵõ����ֽ�����д��һ��Ŀ��������С�
			oos.flush();
			
			//�����л�
			fis = new FileInputStream("d:/c.txt");
			//ͨ��ObjectInputStream���ļ��ж��������ݷ����л���Person����
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();//readObject()������һ��Դ�������ж�ȡ�ֽ����У��ٰ����Ƿ����л�Ϊһ�����󣬲����䷵�ء�
			System.out.println(p);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�ر���
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
