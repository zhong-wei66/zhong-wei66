package com.zw.java300_13.prototype;

import java.util.Date;

public class Sheep implements Cloneable{
	private String sname;
	private Date birthday;
	
	//��дclone����
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//ֱ�ӵ���obj�����clone()����
		return obj;		
	}
	
	//����set��get����
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
	
	//��ӹ�����
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	private void sleep() {
		
		}
}
