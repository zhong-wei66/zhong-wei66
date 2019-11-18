package c.zw.thread;

/**
 * 11.5.1 ʲô���߳�ͬ��
 * ��ʾ��11-9�����̲߳���ͬһ������(δʹ���߳�ͬ��)
 * @author Administrator
 *
 */
public class TestSync {
	public static void main(String[] args) {
		Account a1 = new Account(100, "��΢");
		Drowing drow1 = new Drowing(50, a1);//����ȡǮ�̶߳���
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

class Account {//�����˻�
	int money;//��ǰ�˻���ǰ����
	String aname;
	public Account(int money, String aname) {
		super();
		this.money = money;
		this.aname = aname;
	}
	
}


class Drowing extends Thread {//ģ��������
	int drowingNum;//ȡ����Ǯ
	Account account;//ҪȡǮ���˻�
	int expenseTotal;//�ܹ�ȡ��Ǯ��
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
				Thread.sleep(1000);//�ж���������������߳̿�ʼ���С�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drowingNum;
			expenseTotal += drowingNum;
			System.out.println(this.getName()+"--�˻���"+account.money);
			System.out.println(this.getName() + "--�ܹ�ȡ�ˣ�" + expenseTotal);
			
		}
}
