package c.zw.thread;
/**
 * 11.4.2 线程的优先级
 *getPriority():获取线程的优先级数
 *setPriority():设置线程的优先级数
 *线程的优先级用数字表示，范围从1到10
 *优先级低只是意味着获得调度的概率低。并不是绝对先调用优先级高的线程后调用优先级低的线程。
 * @author Administrator
 *
 */

public class TestThreadPriority {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyPriority(),"t1");
		Thread t2 = new Thread(new MyPriority(),"t2");
		t1.setPriority(1);//线程的优先级用数字表示，范围从1到10
		t2.setPriority(10);//优先级低只是意味着获得调度的概率低。并不是绝对先调用优先级高的线程后调用优先级低的线程。
		t1.start();
		t2.start();
	}
}

class MyPriority extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}