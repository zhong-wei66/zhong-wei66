package zw_java_study02;

import javax.jws.soap.SOAPBinding.Style;

/**
 * ��Ԫ�����
 * @author Administrator
 *
 */
public class TestOperator06 {
	public static void main(String[] args) {
		int score = 80;
		String type = score<60?"������":"����";
		System.out.println(type);
	}

}
