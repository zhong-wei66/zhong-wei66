package cn.zw.array2;


public class TestArrayCope02 {
	public static void main(String[] args) {
		String[] str= {"����","����","��ѧ��","�ٶ�","����ѷ","�ȸ�"};
		removeElement(str, 2);
		
	}
	
	//��װһ������������ɾ�������е�ĳ��Ԫ�أ�������ԭ����
	public static String[] removeElement(String[] s,int index){
		System.arraycopy(s, index+1, s, index, s.length-index-1);
		s[s.length-1] = null;
		for (int i = 0; i < s.length; i++) {
			System.out.println(i+"-------"+s[i]);
		}
		return s;
	}
	
	//��װһ������������һ��Ԫ��
	//��������ĳ����ǹ̶��ģ�����Ԫ�غ�����䵱����������Ҫ����
	//�������ݣ��������Ƕ���һ����������飬Ȼ��ԭ����ԭ�ⲻ���Ŀ�����������
	
	public static void extendRangee() {
		
	}
	

}
