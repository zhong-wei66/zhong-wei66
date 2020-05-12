package com.zw.java300_13.bridge;

public interface Computer {
	void sale();
}

class Desktop implements Computer {
	@Override
	public void sale() {
		System.out.println("����̨ʽ����");
		
	}	
}

class Laptop implements Computer {
	@Override
	public void sale() {
		System.out.println("���۱ʼǱ���");
		
	}	
}

class Pad implements Computer {
	@Override
	public void sale() {
		System.out.println("����ƽ����ԣ�");
		
	}	
}

class LenovoDesktop extends Desktop{
	@Override
	public void sale() {
		System.out.println("��������̨ʽ����");
	}
}
class LenovoLaptop extends Laptop{
	@Override
	public void sale() {
		System.out.println("��������ʼǱ���");
	}
}
class LenovoPad extends Pad{
	@Override
	public void sale() {
		System.out.println("��������ƽ����ԣ�");
	}
}
