package homeWork;
/**
 * �����±�����2
 * 2. ��д����ʵ�����ֵ������������ֿ��Ե��಻ͬ�������Ӷ�������ͬ�����������Ե���������������������ٺ����á�
 *  ʵ��˼·���ؼ����룺
 *  1) ����������Instrument����������makeSound();
 *  2) ��������������ࣺ����Erhu������Piano��С����Violin;
 *  3) ����������Musician�����Ե����������play(Instrument i);
 *   4) ��������࣬�����ֲ�ͬ�������������ࡣ
 * @author Administrator
 *
 */

class Instrument{//������
	public void makeSound() {
		System.out.println("������������");
		
	}
	
}

class Erhu extends Instrument{//����������ࣺ����
	public void makeSound() {
		System.out.println("������������");
	}
}

class Piano extends Instrument{//����������ࣺ����
	public void makeSound() {
		System.out.println("���ٷ�������");
	}
}

class Violin extends Instrument{//����������ࣺС����
	public void makeSound() {
		System.out.println("С���ٷ�������");
	}
}

class Musician{//������
	public void play(Instrument i) {//�����������
		i.makeSound();
		
	}
}
class testInstrument{//������
	public void musicionPlay(String name,Instrument i) {
		System.out.println(name);
		Musician musician=new Musician();
		musician.play(i);
	}
	
}

public class day5_code02 {
	
	public static void main(String[] args) {
		Instrument sound1 = new Erhu();
		Instrument sound2 = new Piano();
		Instrument sound3 = new Violin();
		//sound1.makeSound();
		Musician musician = new Musician();
		musician.play(sound1);
		testInstrument t=new testInstrument();
		t.musicionPlay("zhongwei", sound2);
		
	}
	

}
