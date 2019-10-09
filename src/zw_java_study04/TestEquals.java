package zw_java_study04;



public class TestEquals {
	public static void main(String[] args) {
		Object obj;
		String str;
		
		UserE u1=new UserE(1000,"tom", "123456");
		UserE u2=new UserE(1000,"aymi", "123456");
		System.out.println(u1==u2);//false
		System.out.println(u1.equals(u2));//true
		
		String str1 = new String("sxt");
		String str2 = new String("sxt");
		System.out.println(str1==str2);//false,str1��str2����ͬһ������
		System.out.println(str1.equals(str2));//true,str1��str2ֵ��һ����
	}

}

class UserE {
	int id;
	String name;
	String pwd;
	public UserE(int id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	//���´�����ͨ�����Ҽ�-source-������hashCode..ѡ���
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserE other = (UserE) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
	
}
