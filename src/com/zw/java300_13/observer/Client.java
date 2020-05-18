package com.zw.java300_13.observer;

public class Client {
	public static void main(String[] args) {
		//Ŀ�����
		ConcreteSubject subject = new ConcreteSubject();
		
		//��������۲���
		ObserverA obs1 = new ObserverA();
		ObserverA obs2 = new ObserverA();
		ObserverA obs3 = new ObserverA();
		
		//���������۲�����ӵ�subject����Ĺ۲��߶�����
		subject.registerObserver(obs1);
		subject.registerObserver(obs2);
		subject.registerObserver(obs3);
		
//		//�鿴ԭ�й۲��ߵ�״̬
//		System.out.println(obs1.getMyState());
//		System.out.println(obs2.getMyState());
//		System.out.println(obs3.getMyState());
//		
		//�ı�subject��״̬
		subject.setState(3000);
		System.out.println("###########");
		//���ǿ������۲��ߵ�״̬�ǲ���Ҳ�����˱仯
		System.out.println(obs1.getMyState());
		System.out.println(obs2.getMyState());
		System.out.println(obs3.getMyState());
		
		
	}
	
	
}
