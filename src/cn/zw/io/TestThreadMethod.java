package cn.zw.io;

import org.omg.PortableInterceptor.TRANSPORT_RETRY;

/**
 * 11.4.1 获取线程基本信息的常用方法
 * isAlive()://判断是否在运行
 *currentThread():获取当前证在运行的线程对象
 *getName()：取得当前线程的名字
 *setName():给线程一个名字
 *getPriority():获取线程的优先级数
 *setPriority():设置线程的优先级数
 */

public class TestThreadMethod {
	public static void main(String[] args) {
		Runnable r = new MyThread();
		Thread t = new Thread(r,"Name test");//定义线程对象，并传入参数
		t.start();//启动线程
		System.out.println("name is:"+t.getName());//输出线程名称
//		Thread.currentThread().sleep(5000);//暂停线程,sleep()必须进行异常处理，否则会报错
		System.out.println(t.isAlive());//判断是否在运行
		System.out.println("over!");
	}

}

class MyThread implements Runnable {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(5000);//暂停线程
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
