package com.zw.java300_13.chainOfResp;

public class Client {
	public static void main(String[] args) {
		Leader a = new Director("����");
		Leader b = new Manager("����");
		Leader b2 = new ViceGeneralManager("��С��");
		Leader c = new GeneralManager("����");
		
		//��֯���ι�ϵ
		a.setNextLeader(b);
		b.setNextLeader(b2);
		b2.setNextLeader(c);
		
		//��ʼ����
		LeaveRequest req1 = new LeaveRequest("TOM", 15, "��Ӣ���ϼ�̽�ף�");
		a.handleRequest(req1);
	}
	
}
