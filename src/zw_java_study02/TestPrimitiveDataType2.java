package zw_java_study02;

import java.math.*;
/**
 * ���Ը�����
 * @author Administrator
 *
 */
public class TestPrimitiveDataType2 {
	
	public static void main(String[] args) {
		
		float a = 3.14F;
		double b = 6.28;
		double c = 6.28E-2;
		System.out.println(c);
		
		//���������Ǿ�ȷ�ģ���Ҫ���ڱȽ�
		float f = 0.1f;
		double d = 1.0/10;
		System.out.println("f==d"); //���Ϊfalse
		
		
		float d1 = 4233423423f;
		float d2 = d1 + 1;
		if (d1==d2) {
			System.out.println("d1==d2");	
		}
		else {
			System.out.println("d1!=d2");
		}
	}
}	
		
		