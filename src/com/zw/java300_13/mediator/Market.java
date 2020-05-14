package com.zw.java300_13.mediator;

/**
 * �г�����
 * @author Administrator
 *
 */
public class Market implements Department {
	
	private Mediator m; //�����н��ߣ��ܾ���������
	
	public Market(Mediator m) {
		super();
		this.m = m;
		m.register("market", this);//ע�ᣬ��ǰ����ͬʱע�ᵽ�н��ǣ����໥�ҵ�
	}

	@Override
	public void selfAction() {
		System.out.println("�г�����ȥ����Ŀ��");
	}

	@Override
	public void outAction() {
		System.out.println("�г������ܾ���㱨��������Ŀ�нӽ��ȣ���Ҫ�ʽ�֧�֣�");
		
		m.command("finacial");//���ܾ���ķ���
	}

}
