package homeWork;
/**
 * �����±�����3
 * 3. ��д��������Ӱ�Ӹ��������ˡ�����˵������ʹ����������˼�룬����Զ����࣬����Ӱ�Ӹ����X���ˡ�
 * ʵ��˼·��
 * 1) ����Ӱ�Ӹ��������˵����ԣ������ݵ�Ӱ�������ݵ��Ӿ磬���Գ���
 * 2) �������ӿ���������
 * a) �ݵ�Ӱ�Ľӿ�-----�������ݵ�Ӱ
 * b) �ݵ��Ӿ�Ľӿ�-----�������ݵ��Ӿ�
 * c) ����Ľӿ�-----����������
 * 3) ����������ʵ�ֶ���ӿ�
 * 
 *
 */

interface Move{//��Ӱ�ӿ�
	public abstract void move();
}
interface Tv1{//���Ӿ�ӿ�
	public abstract void tv();
}
interface singsong{//����ӿ�
	public abstract void sing();
}

class Artist implements Move,Tv1,singsong{//�ӿ�ʵ��
	
	//���췽��
	public Artist(String name) {		
		System.out.println("��Һã�����" + name);
	}
	
	//��ͨ����
	public void sing() {
		System.out.println("���ܳ���");
	}
	public void tv() {
		System.out.println("�����ݵ��Ӿ�");	
	}
	public void move() {
		System.out.println("�����ݵ�Ӱ");
	}
	
}

public class day5_code03 {
	public static void main(String[] args) {
		Artist a = new Artist("����");
		a.move();
		a.tv();
		a.sing();
	}
}



//
//interface  Artist{//���˽ӿ�
//	public static final String name = "����";
//	public abstract void Feature();//����һ����������
//}
//
//class Move implements Artist{//�ݵ�Ӱ
//
//	@Override
//	public void Feature() {
//		System.out.println("�ݵ�Ӱ");
//		
//	}
//}
//
//class Tv implements Artist{//�ݵ��Ӿ�
//
//	@Override
//	public void Feature() {
//		System.out.println("�ݵ��Ӿ�");
//	}
//	
//}
//
//class Sing implements Artist{
//
//	@Override
//	public void Feature() {
//		System.out.println("����");
//		
//	}
//	
//}
//
//
//public class day5_code03 {
//	public static void main(String[] args) {
//		Artist move = new Move();
//		Artist tv = new Tv();
//		Artist sing = new Sing();
//		System.out.println("��Һ����ǣ�"+Artist.name);
//		move.Feature();
//		tv.Feature();
//		sing.Feature();
//	}
//
//}
