package com.zw.java300_13.mediator;

/**
 * ������
 * @author Administrator
 *
 */
public class Finacial implements Department {
	
	private Mediator m; //�����н��ߣ��ܾ���������
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);//ע�ᣬ��ǰ����ͬʱע�ᵽ�н��ǣ����໥�ҵ�
	}

	@Override
	public void selfAction() {
		System.out.println("��������Ǯ��");
	}

	@Override
	public void outAction() {
		System.out.println("�������ܾ���㱨������Ǯ̫���ˣ���ô����");
	}

}
