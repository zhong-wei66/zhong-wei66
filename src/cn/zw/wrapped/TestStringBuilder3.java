package cn.zw.wrapped;

/**
 * 【示例8-13】String和StringBuilder在频繁字符串修改时效率测试
 * 可变字符序列和不可变字符序列使用陷阱
 * @author Administrator
 *
 */

public class TestStringBuilder3 {
	public static void main(String[] args) {
		//使用String进行字符串的拼接
		System.out.println("###########以下代码会造成程序崩溃，在项目中不能有这种代码############");
		
		
		String str="";
		for (int i = 0; i < 5000; i++) {
			str=str+i;//相当于产生了10000个对象，循环一次产生一个i对象、一个str和i拼接的对象
			
		}
		System.out.println(str);
		
		
		System.out.println("######################");
		
		//使用StringBuilder进行字符串拼接
		StringBuilder sb1=new StringBuilder("");
		for (int i = 0; i < 5000; i++) {
			sb1.append(i);//不会频繁产生额外的对象，直接把i往数组对象后面添加
		}
		System.out.println(sb1);
		
		
		
		
		
		
		System.out.println("");
		//下面对String和StringBuilder循环增加字符串，增加了效率测试
		
		//使用String进行字符串的拼接
		String str2="";
		//本质上使用StringBuilder拼接，但是每次循环都会生成一个StringBuilder对象
		long num1=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time1=System.currentTimeMillis();//获取系统当前时间
		for (int i = 0; i < 5000; i++) {
			str2=str2+i;//相当于产生了10000个对象，循环一次产生一个i对象、一个str和i拼接的对象
			
		}
		long num2=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time2=System.currentTimeMillis();//获取系统当前时间
		System.out.println("String占用内存："+(num1-num2));
		System.out.println("String占用时间："+(time2-time1));
		
		//使用StringBuilder进行字符串拼接
		StringBuilder sb2=new StringBuilder("");
		long num3=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time3=System.currentTimeMillis();//获取系统当前时间
		for (int i = 0; i < 5000; i++) {
			sb2.append(i);//不会频繁产生额外的对象，直接把i往数组对象后面添加
		}
		long num4=Runtime.getRuntime().freeMemory();//获取系统剩余内存空间
		long time4=System.currentTimeMillis();//获取系统当前时间
		System.out.println("StringBuilder占用内存："+(num3-num4));
		System.out.println("StringBuilder占用时间："+(time4-time3));
		
		
	}

}
