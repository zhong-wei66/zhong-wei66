package cn.zw.io;
/*
 * �ݹ飺�����Լ����Լ�
 * �ݹ�ͷ����ʱ�����ݹ�
 * �ݹ��壺�ظ�����
 * 
 */



public class DirDemo03 {
	public static void main(String[] args) {
		printTen(1);
	}
	//��ӡ1-10����
	public static void printTen(int n) {
		if (n>10) {//�ݹ�ͷ�������ݹ�
			return;
		}
		System.out.println(n);
		printTen(n+1);//�����壺�Լ����Լ�
	}

}
