package c.zw.thread;
/**
 * 11.3.2 ��ֹ�̵߳ĵ��ͷ�ʽ
 * @author Administrator
 *
 */

public class TestThreadCiycle implements Runnable{
	String name;
	boolean live = true;//��Ǳ�������ʾ�߳��Ƿ����ֹ
	
	public TestThreadCiycle(String name) {
		super();
		this.name = name;
	}
	
	public void run() {
		int i = 0;
		//��live��ֵ��trueʱ�������߳��壻false�����ѭ�����̶���ֹ�߳���
		while (live) {
			System.out.println(name+(i++));
		}
	}

	public void terminate() {
		live = false;
	}
	
	public static void main(String[] args) {
		TestThreadCiycle ttc = new TestThreadCiycle("�߳�A��");
		Thread t1 = new Thread(ttc);//����״̬
		t1.start();//����״̬
		for (int i = 0; i < 100; i++) {
			System.out.println("������: "+i);
		}
		ttc.terminate();
		System.out.println("ttc stop!");
	}
}
