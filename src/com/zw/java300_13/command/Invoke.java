package com.zw.java300_13.command;

//����ĵ�����/������
public class Invoke {
	private Command command;//Ҳ����ͨ������List<Command>���ɺܶ�������󣬽������������ݿ�ײ���������������ƵĽṹ

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//ҵ�񷽷�
	public void call() {
		command.execute();
	}
}
