package com.zw.java300_13.adapter;
/**
 * ��������������������ʽ��ʹ������ϵķ�ʽ��������������ϣ�
 * �൱��usb��ps/2��ת����
 * @author Administrator
 *
 */
public class Adapter2 implements Target {
	private  Adaptee adaptee;
	
	@Override
	public void handleReq() {
		adaptee.request();
	}

	public Adapter2(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}

	

}
