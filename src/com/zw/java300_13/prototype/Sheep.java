package com.zw.java300_13.prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;
	
	//重写clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用obj对象的clone()方法
		return obj;		
	}
	
	//增加set、get方法
	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	} 
	
	//添加构造器
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	private void sleep() {
		
		}
}
