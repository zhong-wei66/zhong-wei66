package c.zw.thread;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 11.6 �̲߳���Э��(������/������ģʽ)
 * @author Administrator
 *
 */

public class TestProduce {
	public static void main(String[] args) {
		SyncStack sStack = new SyncStack();//���建����
		Shengchan sc = new Shengchan(sStack);//���������߳�
		Xiaofei xf = new Xiaofei(sStack);//���������߳�
		sc.start();
		xf.start();
	}
}
class ManTou{//��ͷ
	int id;

	ManTou(int id) {
		this.id = id;
	}
	
}

class SyncStack{//���������൱����ͷ��
	int index = 0;
	ManTou[] ms = new ManTou[10];
	
	public synchronized void push(ManTou m) {
		while (index == ms.length) {//˵����ͷ������
			try {
				//wait���̻߳Ὣ���е����ͷţ���������״̬��
	            //����������Ҫ�����߳̾Ϳ��Ի������
	            this.wait();
	            //����ĺ�����ִ�д˷������߳���ͣ����������״̬��
	            //����������������ͷ����������
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		// �����ڵ�ǰ����ȴ����еȴ��ĵ�һ���̡߳�
        //notifyAll���������ڵ�ǰ����ȴ����еȴ��������̡߳�
        this.notify();
        // ��������ѵĻ����Ժ��������̶߳������ȴ��̣߳�û���˻��ѡ�
        ms[index] = m;
        index++;
		
	}
	public synchronized ManTou pop() {
		while (index == 0) {//�����ͷ���ǿյ�
			try {
				//�����ͷ���ǿյģ�����ͣ�������̣߳���Ϊûʲô�����ѵ��
				this.wait();//�������߳��������������ѣ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		this.notify();
		index--;
		return ms[index];
	}
	
}

class Shengchan extends Thread {// �������߳�
    SyncStack ss = null;
 
    public Shengchan(SyncStack ss) {
        this.ss = ss;
    }
 
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("������ͷ��" + i);
            ManTou m = new ManTou(i);
            ss.push(m);
        }
    }
}


class Xiaofei extends Thread {// �������̣߳�
    SyncStack ss = null;
 
    public Xiaofei(SyncStack ss) {
        this.ss = ss;
    }
 
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            ManTou m = ss.pop();
            System.out.println("������ͷ��" + i);
 
        }
    }
}