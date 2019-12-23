package cn.zw.thread;
/**
 * 11.5.2 ʵ���߳�ͬ��
 * @author Administrator
 *
 */


public class TestSync2 {
	public static void main(String[] args) {
		Account1 a1 = new Account1(100, "��");
        Drawing draw1 = new Drawing(80, a1);
        Drawing draw2 = new Drawing(80, a1);
        draw1.start(); // ��ȡǮ
        draw2.start(); // ������ȡǮ
	}
	
}

class Account1 {//�����˻�
	int money;
	String aname;
	public Account1(int money, String aname) {
		super();
		this.money = money;
		this.aname = aname;
	}
	
}

class Drawing extends Thread{//ģ��������
	int drawingNum;//ȡǮ��
	Account1 account;//ҪȡǮ���˻�
	int expenseTotal;//�ܹ�ȡ��Ǯ��
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
				System.out.println(this.getName()+"ȡ����㣡");
				return;
			}
			try {
				Thread.sleep(1000);//�ж���������������߳̿�ʼ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.money -= drawingNum;
			expenseTotal += drawingNum;
			
		}
		System.out.println(this.getName()+"--�˻���"+account.money);
		System.out.println(this.getName()+"--�ܹ�ȡ�ˣ�"+expenseTotal);
		
	}
	
	
}
