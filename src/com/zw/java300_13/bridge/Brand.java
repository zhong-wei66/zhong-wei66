package com.zw.java300_13.bridge;
/**
 * 电脑品牌
 * @author Administrator
 *
 */
public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		System.out.println("销售联想电脑");	
	}
	
}
class Dell implements Brand{

	@Override
	public void sale() {
		System.out.println("销售Dell电脑");	
	}
	
}
class ShenZhou implements Brand{

	@Override
	public void sale() {
		System.out.println("销售神舟电脑");	
	}
	
}


