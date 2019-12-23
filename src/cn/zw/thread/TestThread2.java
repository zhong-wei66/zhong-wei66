package cn.zw.thread;
/**
 * 11.2.2 通过Runnable接口实现多线程
 * @author Administrator
 *
 */
public class TestThread2 implements Runnable {//自定义类实现Runnable接口

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
	}
	
	public static void main(String[] args) {
		//创建线程对象，把实现Runnable接口的对象作为参数传入
		Thread thread1 = new Thread(new TestThread2());
		thread1.start();//启动线程
		
		Thread thread2 = new Thread(new TestThread2());
		thread2.start();
		
		
	}
}
