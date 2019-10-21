package homeWork;
/**
 * 这里是第四章编码题3
 * 构造方法与重载：定义一个网络用户类，
*信息有用户 ID、用户密码、 email 地址。
*在建立类的实例时把以上三个信息都作为构造函数的参数输入， 
*其中用户 ID 和用户密码时必须缺省时 email地址是用户 ID 加上字符串"@gameschool.com"
 * @author Administrator
 *
 */
public class day4_code03 {
	int id;
	int psw;
	String email;
	
	//重载
	public day4_code03() {
		System.out.println("用户什么都没输入");
		
	}
	
	public day4_code03(int id,int psw,String email) {
		this.id=id;
		this.psw=psw;
		this.email=email;
		System.out.println("用户信息输入完全");
		System.out.println("用户id是："+id+"， 密码："+psw+"， 邮箱："+email);
	}
	
	public day4_code03(int id,int psw) {
		this.id=id;
		this.psw=psw;
		System.out.println("用户没输入邮箱，邮箱号默认为用户id+@gameschool.com");
		System.out.println("用户id是："+id+"， 密码："+psw+"， 邮箱："+id+"@gameschool.com");
	}
	
	public static void main(String[] args) {
		day4_code03 user=new day4_code03();
		day4_code03 user1=new day4_code03(1,123456,"zhong_wei168@163.com");
		day4_code03 user2=new day4_code03(2,111222);
		
	}

}
