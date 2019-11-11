package c.zw.thread;
/**
 * 11.2.1 通过继承Thread类实现多线程
 * @author Administrator
 *
 */

public class testThread extends Thread{//自定义类继承Thread类
	//run()方法里是线程体
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName()+":"+i);//getName()方法返回线程名称
		}
	}
	
	public static void main(String[] args) {
		testThread thread1 = new testThread();//创建线程对象
		thread1.start();//启动线程
		testThread thread2 = new testThread();
		thread2.start();
		
	}

}
