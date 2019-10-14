package cn.zw.array2;

import java.util.Arrays;

/**
 * 数组存储表格数据
 * @author Administrator
 *
 */

public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] emp1= {1001,"高淇",18,"讲师","2006-2-14"};
		Object[] emp2= {1002,"高小七",19,"助教","2007-10-10"};
		Object[] emp3= {1003,"高小琴",20,"班主任","2008-5-5"};
		
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
