package com.zw.java300_13.memento;

public class Client {
	public static void main(String[] args) {
		CareTaker taker = new CareTaker();
		
		Emp emp = new Emp("钟微", 18, 10000);
		System.out.println("第一次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		taker.setMemento(emp.memento());//备忘一次
		
		emp.setAge(38);
		emp.setEname("搞起");
		emp.setSalary(9000);
		System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
		emp.recover(taker.getMemento());//恢复到备忘对象保存的状态
		
		System.out.println("第二次打印对象："+emp.getEname()+"---"+emp.getAge()+"---"+emp.getSalary());
		
	}
}
