package Test;

public class test01 {
    public static void main(String[] args) {
    	SyncStack sStack = new SyncStack();//�������߳�
    	Shengchan sc = new Shengchan(sStack);//�����߳�
    	Xiaofei xf = new Xiaofei(sStack);//�����߳�
    	sc.start();
    	xf.start();
    	
    }
    
}
class Mantou{//��ͷ
	int id;
	
	public Mantou(int id) {
		super();
		this.id = id;
	}	
}

class SyncStack{//���������൱����ͷ��
	int index = 0;
	Mantou[] ms = new Mantou[10];
	
	public synchronized void push(Mantou m) {
		while (index == ms.length) {//˵����ͷ������
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		this.notify();
		ms[index] = m;
		index++;
	}
	
	public synchronized Mantou pop() {
		while (index == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		this.notify();
		index--;
		return ms[index];
	}
}

class Shengchan extends Thread{//�������߳�
	SyncStack ss = null;

	public Shengchan(SyncStack ss) {
		super();
		this.ss = ss;
	}
	@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("������ͷ��"+i);
				Mantou m = new Mantou(i);
				ss.push(m);
			}
		}
}

class Xiaofei extends Thread{
	SyncStack ss = null;

	public Xiaofei(SyncStack ss) {
		super();
		this.ss = ss;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			Mantou m = ss.pop();
			System.out.println("������ͷ��"+i);
		}
	}
}

