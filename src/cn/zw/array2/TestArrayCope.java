package cn.zw.array2;
/**
 * 数组的拷贝
 * @author Administrator
 *
 */
public class TestArrayCope {
	
	public static void main(String[] args) {
		String[] s1= {"aa","bb","cc","dd","ee"};
		String[] s2=new String[10];
		System.arraycopy(s1,2,s2,6,3);
		
		for (int i = 0; i < s2.length; i++) {
			System.out.println(i+"--"+s2[i]);
			
		}
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//src：数组
		//srcPos：从src数组第几个开始拷贝
		//dest：目标数组
		//destPos：从目标数组dest第几个开始放置
		//length：拷贝多少
		
		
		System.out.println("*************************");
		
		//测试从数组中删除某个元素，本质上话说数组的拷贝
		//删除数组中指定索引位置的元素，并将原数组返回
		//把String[] s3= {"aa","bb","cc","dd","ee"};删除cc
		String[] s3= {"aa","bb","cc","dd","ee"};
		//String[] s4=new String[10];
		System.arraycopy(s3,3 , s3,3-1,s1.length-3 );
		//System.arraycopy(s3, 3, s4, 7, 2);
		
		//把最后一个元素置为空
		s3[s3.length-1]=null;
		
		for (int i = 0; i < s3.length; i++) {
			System.out.println(i+"--"+s3[i]);
			
		}
		
		
	}
	
	
	

	

}
