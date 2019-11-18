package c.zw.thread;

/**
 * 11.5.1 什么是线程同步
 * 【示例11-9】多线程操作同一个对象(未使用线程同步)
 * @author Administrator
 *
 */
public class TestSync {
	public static void main(String[] args) {
		Account a1 = new Account(100, "钟微");
		Drowing drow1 = new Drowing(50, a1);//定义取钱线程对象
		Drowing drow2 = new Drowing(80,a1);
		long time1 = System.currentTimeMillis();
		drow1.start();
		long time2 = System.currentTimeMillis();
		drow2.start();
		long time3 = System.currentTimeMillis();
		System.out.println(time2-time1);
		System.out.println(time3-time2);
	}
}

class Account {//银行账户
	int money;//当前账户的前数量
	String aname;
	public Account(int money, String aname) {
		super();
		this.money = money;
		this.aname = aname;
	}
	
}


class Drowing extends Thread {//模拟提款操作
	int drowingNum;//取多少钱
	Account account;//要取钱的账户
	int expenseTotal;//总共取的钱数
	public Drowing(int drowingNum, Account account) {
		super();
		this.drowingNum = drowingNum;
		this.account = account;
		
	}
	@Override
		public void run() {
			if (account.money - drowingNum <0) {
				return;
			}
			try {
				Thread.sleep(1000);//判断完后阻塞。其他线程开始运行。
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drowingNum;
			expenseTotal += drowingNum;
			System.out.println(this.getName()+"--账户余额："+account.money);
			System.out.println(this.getName() + "--总共取了：" + expenseTotal);
			
		}
}
