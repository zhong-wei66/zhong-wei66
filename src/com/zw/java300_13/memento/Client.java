package com.zw.java300_13.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("��΢", 18, 10000);
		System.out.println("��һ�δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());//����һ��
		
		emp.setAge(38);
		emp.setEname("����");
		emp.setSalary(9000);
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recover(taker.getMemento());//�ָ����������󱣴��״̬
		
		System.out.println("�ڶ��δ�ӡ����"+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}
