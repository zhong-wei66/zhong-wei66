package c.zw.thread;
/**
 * 11.3.4 �̵߳�����join()
 * �߳�A�������ڼ䣬���Ե����߳�B��join()���������߳�B���߳�A���ϡ�
 * �������߳�A�ͱ���ȴ��߳�Bִ����Ϻ���ܼ���ִ�� 
 *
 */

public class TestThreadJoin {
	public static void main(String[] args) {
		System.out.println("�ְֺͶ������̵Ĺ���");
		Thread father = new Thread(new FatherThread());
		father.start();
	}

}

class FatherThread implements Runnable {
	
	public void run() {
		System.out.println("�ְ�����̣������̳�����");
		System.out.println("�ְ��ö��ӳ�ȥ�������ɽ");
		Thread son = new Thread(new SonThread());
		son.start();
		System.out.println("�ְֵȶ������̻���");
		try {
			son.join();//join��������ʹfather�̱߳���ȴ�son�߳�ִ����ɲż���ִ��
		} catch (InterruptedException e) {//InterruptedException�ж���Ӧ�쳣
			e.printStackTrace();
			System.out.println("�ְֳ���ȥ�Ҷ���");
			// ����JVM�������exit(0)���ʾ��������������Ƿ�0���ʾ����������
			System.exit(1);
		}
		System.out.println("�ְָ��˵Ľӹ��̿�ʼ�飬����Ǯ���˶���");
	}
}

class SonThread implements Runnable {
	
	public void run() {
		System.out.println("���ӳ�������");
		System.out.println("����������Ҫʮ����");
		try {
			for (int i = 0; i <=10; i++) {
				System.out.println("��"+i+"����");
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("�������̻�����");
	}
}