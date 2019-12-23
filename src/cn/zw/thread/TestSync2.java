package cn.zw.thread;
/**
 * 11.5.2 实现线程同步
 * @author Administrator
 *
 */


public class TestSync2 {
	public static void main(String[] args) {
		Account1 a1 = new Account1(100, "高");
        Drawing draw1 = new Drawing(80, a1);
        Drawing draw2 = new Drawing(80, a1);
        draw1.start(); // 你取钱
        draw2.start(); // 你老婆取钱
	}
	
}

class Account1 {//银行账户
	int money;
	String aname;
	public Account1(int money, String aname) {
		super();
		this.money = money;
		this.aname = aname;
	}
	
}

class Drawing extends Thread{//模拟提款操作
	int drawingNum;//取钱数
	Account1 account;//要取钱的账户
	int expenseTotal;//总共取得钱数
	public Drawing(int drawingNum, Account1 account) {
		super();
		this.drawingNum = drawingNum;
		this.account = account;
	}
	@Override
		public void run() {
			draw();
		}
	void draw() {
		synchronized(account){
			if (account.money - drawingNum < 0) {
				System.out.println(this.getName()+"取款，余额不足！");
				return;
			}
			try {
				Thread.sleep(1000);//判断完成阻塞。其他线程开始运行
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drawingNum;
			expenseTotal += drawingNum;
			
		}
		System.out.println(this.getName()+"--账户余额："+account.money);
		System.out.println(this.getName()+"--总共取了："+expenseTotal);
		
	}
	
	
}
