package com.zw.java300_13.prototype;

import java.util.Date;
//测试深复制
public class Sheep2 implements Cloneable{
	private String sname;
	private Date birthday;
	
	//重写clone方法
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Object obj = super.clone();//直接调用obj对象的clone()方法
		
		//添加如下代码实现深复制（deep clone）
		Sheep2 s = (Sheep2) obj;
		s.birthday = (Date) this.birthday.clone();//把属性也进行克隆
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
	public Sheep2(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}
	
	private void sleep() {
		
		}
}
