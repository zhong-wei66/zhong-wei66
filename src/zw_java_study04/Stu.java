package zw_java_study04;

public class Stu {
	//����fields
	int id;
	String sname;
	int age;
	
	Computer comp;//�����
	
	//����
	void study(){
		System.out.println("����������ʹ�õĵ����ǣ�"+comp.brand);
	}
	
	void play(){
		System.out.println("������ҫ");
	}
	
	//���췽�������ڴ��������Ķ����޲εĹ��췽������ϵͳ�Զ�����
	//�������������������һ��
	Stu(){
		
	}
	
	//main�����ǳ���ִ�е���ڣ�����Ҫ��
	public static void main(String[] args) {
		Stu stu = new Stu();//new����һ������
		System.out.println("stu�ĵ�ַ��"+stu);
		stu.id=1001;
		stu.sname="��΢";
		stu.age=18;
		
		Computer c1=new Computer();
		c1.brand="����";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
			
	}

}

class Computer{
	String brand;//brandƷ��
	
}
