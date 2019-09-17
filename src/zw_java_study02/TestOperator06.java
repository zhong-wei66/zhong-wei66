package zw_java_study02;

import javax.jws.soap.SOAPBinding.Style;

/**
 * 三元运算符
 * @author Administrator
 *
 */
public class TestOperator06 {
	public static void main(String[] args) {
		int score = 80;
		String type = score<60?"不及格":"及格";
		System.out.println(type);
	}

}
