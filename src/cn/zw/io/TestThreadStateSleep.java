package cn.zw.io;
/**
 * 11.3.3 暂停线程执行sleep/yield
 *  sleep()方法：可以让正在运行的线程进入阻塞状态，直到休眠时间满了，进入就绪状态
 *  运行时会有明显延迟，这是sleep(2000)在起作用
 * @author Administrator
 *
 */

public class TestThreadStateSleep {
	public static void main(String[] args) {
		stateThread thread1 = new stateThread();
		thread1.start();
		
		stateThread thread2 = new stateThread();
		thread2.start();
		

	}
}	
	
	//使用继承方式实现多继承
class stateThread extends Thread{
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+":"+i);//getName()方法返回线程名称
			try {
				Thread.sleep(2000);//调用线程的sleep()方法
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}


