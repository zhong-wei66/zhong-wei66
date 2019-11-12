package cn.zw.io;
/**
 * 11.3.4 线程的联合join()
 * 
 * @author Administrator
 *
 */

public class TestThreadJoin {
	public static void main(String[] args) {
		System.out.println("爸爸和儿子买烟的故事");
		Thread father = new Thread(new FatherThread());
		father.start();
	}

}

class FatherThread implements Runnable {
	
	public void run() {
		System.out.println("爸爸想抽烟，发现烟抽完了");
		System.out.println("爸爸让儿子出去买包红塔山");
		Thread son = new Thread(new SonThread());
		son.start();
		System.out.println("爸爸等儿子买烟回来");
		try {
			son.join();
		} catch (InterruptedException e) {//InterruptedException中断响应异常
			e.printStackTrace();
			System.out.println("爸爸出门去找儿子");
			// 结束JVM。如果是exit(0)则表示正常结束；如果是非0则表示非正常结束
			System.exit(1);
		}
		System.out.println("爸爸高兴的接过烟开始抽，把零钱给了儿子");
	}
}

class SonThread implements Runnable {
	
	public void run() {
		System.out.println("儿子出门买烟");
		System.out.println("儿子买烟需要十分钟");
		try {
			for (int i = 0; i <=10; i++) {
				System.out.println("第"+i+"分钟");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("儿子买烟回来了");
	}
}