package zw_java_study04;


/**
 * ���Լ̳�
 * @author ��΢
 *
 */

public class TextExtends {
	public static void main(String[] args) {
		Students stus = new Students();
		stus.name = "zhong_wei";
		stus.height = 163;
		stus.rest();
		
		Students stus2 = new Students("����", 163, "�����");
		//instanceof �ж���ߵ������ǲ����ұߵļ̳�
		System.out.println(stus2 instanceof Students);
		
		
	}

}

class Person{
	String name;
	int height;
	public void rest() {
	System.out.println("��Ϣһ�����");
	}
}
	
//extends �̳У��˴���Students �̳� Person
class Students extends Person{
	
	String major;
	public void study() {
		System.out.println("ѧϰ��Сʱ");
	}
	
	//����һ��������
	public Students(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
		
	}
	
	public Students() {
		
	}
	
}