package cn.zw.wrapped;

/**
 * ��ʾ��8-13��String��StringBuilder��Ƶ���ַ����޸�ʱЧ�ʲ���
 * �ɱ��ַ����кͲ��ɱ��ַ�����ʹ������
 * @author Administrator
 *
 */

public class TestStringBuilder3 {
	public static void main(String[] args) {
		//ʹ��String�����ַ�����ƴ��
		System.out.println("###########���´������ɳ������������Ŀ�в��������ִ���############");
		
		
		String str="";
		for (int i = 0; i < 5000; i++) {
			str=str+i;//�൱�ڲ�����10000������ѭ��һ�β���һ��i����һ��str��iƴ�ӵĶ���
			
		}
		System.out.println(str);
		
		
		System.out.println("######################");
		
		//ʹ��StringBuilder�����ַ���ƴ��
		StringBuilder sb1=new StringBuilder("");
		for (int i = 0; i < 5000; i++) {
			sb1.append(i);//����Ƶ����������Ķ���ֱ�Ӱ�i���������������
		}
		System.out.println(sb1);
		
		
		
		
		
		
		System.out.println("");
		//�����String��StringBuilderѭ�������ַ�����������Ч�ʲ���
		
		//ʹ��String�����ַ�����ƴ��
		String str2="";
		//������ʹ��StringBuilderƴ�ӣ�����ÿ��ѭ����������һ��StringBuilder����
		long num1=Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		long time1=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		for (int i = 0; i < 5000; i++) {
			str2=str2+i;//�൱�ڲ�����10000������ѭ��һ�β���һ��i����һ��str��iƴ�ӵĶ���
			
		}
		long num2=Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		long time2=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		System.out.println("Stringռ���ڴ棺"+(num1-num2));
		System.out.println("Stringռ��ʱ�䣺"+(time2-time1));
		
		//ʹ��StringBuilder�����ַ���ƴ��
		StringBuilder sb2=new StringBuilder("");
		long num3=Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		long time3=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		for (int i = 0; i < 5000; i++) {
			sb2.append(i);//����Ƶ����������Ķ���ֱ�Ӱ�i���������������
		}
		long num4=Runtime.getRuntime().freeMemory();//��ȡϵͳʣ���ڴ�ռ�
		long time4=System.currentTimeMillis();//��ȡϵͳ��ǰʱ��
		System.out.println("StringBuilderռ���ڴ棺"+(num3-num4));
		System.out.println("StringBuilderռ��ʱ�䣺"+(time4-time3));
		
		
	}

}
