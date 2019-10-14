package cn.zw.wrapped;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ�������ַ���֮����໥ת��
 * DateForma�������SimpleDateFormaʵ�����ʹ��
 * @author Administrator
 *
 */

public class TestDateFormat {
	public static void main(String[] args)throws ParseException {
		//��ʱ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת������Ӧ���ַ���
		DateFormat df= new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");//������õĸ�ʽyyyy-mm-dd hh:mm:ssת��
		
		String str=df.format(new Date());//format�Ѵ�����ʱ�����ת��Ϊָ����ʽ���ַ���
		System.out.println(str);
		
		//���ַ������ա���ʽ�ַ���ָ���ĸ�ʽ��ת������Ӧ��ʱ�����
		DateFormat df2= new SimpleDateFormat("yyyy��mm��dd�� hhʱmm��ss��");
		Date date=df2.parse("2019��10��14�� 14ʱ22��00��");
		System.out.println(date);
		
		//����������ʽ
		//����D����ȡʱ�����ʱ��ǰ��ݵĵڼ���
		DateFormat df3= new SimpleDateFormat("D");
		String str3=df3.format(new Date());
		System.out.println(str3);
	}

}
