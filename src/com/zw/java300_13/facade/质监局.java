package com.zw.java300_13.facade;

public interface 质监局 {
	void orgCodeCertificate();  //办理组织机构代码证
}


class 海淀区质监局 implements 质监局{

	@Override
	public void orgCodeCertificate() {
		System.out.println("在海淀区质检局办理组织机构代码证！");
	}
	
}