package c.zw.thread;
/**
 * 11.5.3 死锁及解决方案
 * 【示例11-12】死锁问题的解决
 * @author Administrator
 *
 */

class Lipstick02{
	//口红类
}
class Mirror02{
	//镜子类
}

class Makeup02 extends Thread{//化妆类继承了Thread类
	int flag;
	String girl;
	static Lipstick02 lipstick = new Lipstick02();
	static Mirror02 mirror = new Mirror02();
	
	@Override
		public void run() {
			doMakeup();
		}
	
	void doMakeup() {
		if (flag == 0) {
			synchronized (lipstick) {//需要得到口红的锁
				System.out.println(girl+"拿着口红！");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			//把40-42行写到synchronized (lipstick) 就会造成死锁
			synchronized (mirror) {//需要得到镜子的锁
				System.out.println(girl+"拿着镜子！");
			}
		}else {
			synchronized (mirror) {
				System.out.println(girl+"拿着镜子！");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lipstick) {
					System.out.println(girl+"拿着口红！");
				}
			}
		}
	}
	
}

public class TestDeadLock02 {
	public static void main(String[] args) {
		Makeup02 m1 = new Makeup02();//大丫的化妆线程
		m1.girl = "大丫";
		m1.flag = 0;
		Makeup02 m2 = new Makeup02();//二丫的化妆线程
		m2.girl = "二丫";
		m2.flag = 1;
		m1.start();
		m2.start();
		
	}
}
