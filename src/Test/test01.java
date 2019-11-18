package Test;

public class test01 {
    public static void main(String[] args) {
    	SyncStack sStack = new SyncStack();//缓冲区线程
    	Shengchan sc = new Shengchan(sStack);//生产线程
    	Xiaofei xf = new Xiaofei(sStack);//消费线程
    	sc.start();
    	xf.start();
    	
    }
    
}
class Mantou{//馒头
	int id;
	
	public Mantou(int id) {
		super();
		this.id = id;
	}	
}

class SyncStack{//缓冲区（相当于馒头框）
	int index = 0;
	Mantou[] ms = new Mantou[10];
	
	public synchronized void push(Mantou m) {
		while (index == ms.length) {//说明馒头框满了
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

class Shengchan extends Thread{//生产者线程
	SyncStack ss = null;

	public Shengchan(SyncStack ss) {
		super();
		this.ss = ss;
	}
	@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("生产馒头："+i);
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
			System.out.println("消费馒头："+i);
		}
	}
}

