package c.zw.thread;
/**
 * 11.3.2 终止线程的典型方式
 * @author Administrator
 *
 */

public class TestThreadCiycle implements Runnable{
	String name;
	boolean live = true;//标记变量，表示线程是否可中止
	
	public TestThreadCiycle(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		int i = 0;
		//当live的值是true时，继续线程体；false则结束循环，继而中止线程体
		while (live) {
			System.out.println(name+(i++));
		}
	}

	public void terminate() {
		live = false;
	}
	
	public static void main(String[] args) {
		TestThreadCiycle ttc = new TestThreadCiycle("线程A：");
		Thread t1 = new Thread(ttc);//新生状态
		t1.start();//就绪状态
		for (int i = 0; i < 100; i++) {
			System.out.println("主流程: "+i);
		}
		ttc.terminate();
		System.out.println("ttc stop!");
	}
}
