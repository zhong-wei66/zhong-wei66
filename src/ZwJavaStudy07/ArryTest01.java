package ZwJavaStudy07;

public class ArryTest01 {
	public static void main(String[] args) {
		int[] arr01 = new int[10];//������10��ֻ�ܷ�10��int����
		String[] arr02=new String[5];
		
		
		//ͨ��ѭ����ʼ������
		for (int i = 0; i < arr01.length; i++) {
			arr01[i]=10*i;
		}
		//ͨ��ѭ����ȡ��������Ԫ�ص�ֵ
		for (int i = 0; i < arr01.length; i++) {
			System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[3];
		arr03[0] =new User(1001,"��΢");
		arr03[1] = new User(1002,"��2΢");
		arr03[2] = new User(1003,"��3΢");
				
		for (int i = 0; i < arr03.length; i++) {
			System.out.println(arr03[i].getName());
		}
		
		
		
		
	}

}

class User{
	private int id;
	private String name;
	
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
