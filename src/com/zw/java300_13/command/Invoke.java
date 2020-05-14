package com.zw.java300_13.command;

//命令的调用者/发起者
public class Invoke {
	private Command command;//也可以通过容器List<Command>容纳很多命令对象，进行批处理。数据库底层的事务管理就是类似的结构

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	
	//业务方法
	public void call() {
		command.execute();
	}
}
