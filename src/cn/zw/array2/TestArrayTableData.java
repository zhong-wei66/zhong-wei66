package cn.zw.array2;

import java.util.Arrays;

/**
 * ����洢�������
 * @author Administrator
 *
 */

public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] emp1= {1001,"���",18,"��ʦ","2006-2-14"};
		Object[] emp2= {1002,"��С��",19,"����","2007-10-10"};
		Object[] emp3= {1003,"��С��",20,"������","2008-5-5"};
		
		Object[][] tableData = new Object[3][];
		tableData[0] = emp1;
		tableData[1] = emp2;
		tableData[2] = emp3;
//		System.out.println(Arrays.toString(tableData));
		for (Object[] temp:tableData) {
			
			System.out.println(Arrays.toString(temp));
		}
		 
	}

}
