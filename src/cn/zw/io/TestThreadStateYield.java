package cn.zw.io;
/**
 * 11.3.3 暂停线程执行sleep/yield
 * yield()方法：可以让正在运行的线程直接进入就绪状态，让出CPU的使用权。
 * 运行时没有延迟
 * @author Administrator
 *
 */

public class TestThreadStateYield {
	public static void main(String[] args) {
		ThreadYield thread1 = new ThreadYield();
		thread1.start();
		
		ThreadYield thread2 = new ThreadYield();
		thread2.start();
		
		
	}
}

//使用继承方式实现多线程
class ThreadYield extends Thread {
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+":"+i);
			Thread.yield();//调用线程的yield()方法
			try {
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
