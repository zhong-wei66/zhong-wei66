package com.zw.java300_13.chainOfResp;
/**
 * ������
 * @author Administrator
 *
 */
public abstract class Leader {
	protected String name;
	protected Leader nextLeader;//�������ϵĺ�̶���
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	//�趨�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	//��������ĺ��ĵ�ҵ�񷽷�
	public abstract void handleRequest(LeaveRequest request);
	
	
}
