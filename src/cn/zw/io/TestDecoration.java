package cn.zw.io;
/**
 * ��ʾ��10-15��װ����ģʽ��ʾ
 * @author Administrator
 *
 */

class Iphone {
	private String name;

	public Iphone(String name) {
		super();
		this.name = name;
	}
	
	public void show() {
		System.out.println("���ǣ�"+ name + "����������Ļ��ʾ");
	}
}

class TouyingPhone {
	public Iphone phone;

	public TouyingPhone(Iphone p) {
		super();
		this.phone = p;
	}
	//���ܸ�ǿ�ķ���
	public void show() {
		phone.show();
		System.out.println("�һ�����ͶӰ��ǽ������ʾ");
	}
	
	
}
public class TestDecoration {
	public static void main(String[] args) {
		Iphone phone = new Iphone("iphone30");
		phone.show();
		System.out.println("-------------");
		TouyingPhone tyPhone = new TouyingPhone(phone);
		tyPhone.show();
	}
}
