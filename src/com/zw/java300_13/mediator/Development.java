package com.zw.java300_13.mediator;

/**
 * �з�����
 * @author Administrator
 *
 */
public class Development implements Department {
	
	private Mediator m; //�����н��ߣ��ܾ���������
	
	public Development(Mediator m) {
		super();
		this.m = m;
		m.register("development", this);//ע�ᣬ��ǰ����ͬʱע�ᵽ�н��ǣ����໥�ҵ�
	}

	@Override
	public void selfAction() {
		System.out.println("�з���ר�Ŀ��У�������Ŀ��");
	}

	@Override
	public void outAction() {
		System.out.println("�з������ܾ���㱨������ûǮ�ˣ���Ҫ�ʽ�֧�֣�");
	}

}
