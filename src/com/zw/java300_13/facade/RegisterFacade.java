package com.zw.java300_13.facade;
/**
 * ����ע�ṫ˾���̵��������
 * @author Administrator
 *
 */
public class RegisterFacade {
	public void register() {
		���̾� a = new ���������̾�();
		a.checkName();
		�ʼ�� b = new �������ʼ��();
		b.orgCodeCertificate();
		˰���  c  = new ������˰���();
		c.taxCertificate();
		����  d = new �й���������();
		d.openAccount();
	}

}
