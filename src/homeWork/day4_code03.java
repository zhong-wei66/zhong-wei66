package homeWork;
/**
 * �����ǵ����±�����3
 * ���췽�������أ�����һ�������û��࣬
*��Ϣ���û� ID���û����롢 email ��ַ��
*�ڽ������ʵ��ʱ������������Ϣ����Ϊ���캯���Ĳ������룬 
*�����û� ID ���û�����ʱ����ȱʡʱ email��ַ���û� ID �����ַ���"@gameschool.com"
 * @author Administrator
 *
 */
public class day4_code03 {
	int id;
	int psw;
	String email;
	
	//����
	public day4_code03() {
		System.out.println("�û�ʲô��û����");
		
	}
	
	public day4_code03(int id,int psw,String email) {
		this.id=id;
		this.psw=psw;
		this.email=email;
		System.out.println("�û���Ϣ������ȫ");
		System.out.println("�û�id�ǣ�"+id+"�� ���룺"+psw+"�� ���䣺"+email);
	}
	
	public day4_code03(int id,int psw) {
		this.id=id;
		this.psw=psw;
		System.out.println("�û�û�������䣬�����Ĭ��Ϊ�û�id+@gameschool.com");
		System.out.println("�û�id�ǣ�"+id+"�� ���룺"+psw+"�� ���䣺"+id+"@gameschool.com");
	}
	
	public static void main(String[] args) {
		day4_code03 user=new day4_code03();
		day4_code03 user1=new day4_code03(1,123456,"zhong_wei168@163.com");
		day4_code03 user2=new day4_code03(2,111222);
		
	}

}
