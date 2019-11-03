package cn.zw.array2;

import java.util.Arrays;

/**
 * 7.3.4 java.util.Arrays��
 * ��ʾ��7-12������Ԫ�����������͵�����(Comparable�ӿڵ�Ӧ��)
 * 
 */
public class TestComparable {
	public static void main(String[] args) {
		Man[] msMans = {new Man(3, "a"),new Man(60,"b"), new Man(2,"c")};
		Arrays.sort(msMans);
		System.out.println(Arrays.toString(msMans));
		
	}

}

class Man implements Comparable {
	int age;
	int id;
	String name;
	
	public Man(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		
		return this.name;
	}
	
	public int compareTo(Object o) {
		Man man = (Man) o;
		if (this.age<man.age) {
			return -1;
			
		}
		if (this.age>man.age) {
			return 1;
		}
		return 0;
	}
	
	
}
