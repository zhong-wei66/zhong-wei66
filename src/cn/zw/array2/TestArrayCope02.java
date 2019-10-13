package cn.zw.array2;


public class TestArrayCope02 {
	public static void main(String[] args) {
		String[] str= {"阿里","京东","尚学堂","百度","亚马逊","谷歌"};
		removeElement(str, 2);
		
	}
	
	//封装一个方法，用于删除数组中的某个元素，并返回原数组
	public static String[] removeElement(String[] s,int index){
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		s[s.length-1] = null;
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+"-------"+s[i]);
		}
		return s;
	}
	
	//封装一个方法，插入一个元素
	//由于数组的长度是固定的，插入元素后，数组充当都不够，需要扩容
	//数组扩容：本质上是定义一个更大的数组，然后将原数组原封不动的拷贝到新数组
	
	public static void extendRangee() {
		
	}
	

}
