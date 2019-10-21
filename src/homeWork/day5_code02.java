package homeWork;
/**
 * 第五章编码题2
 * 2. 编写程序实现乐手弹奏乐器。乐手可以弹奏不同的乐器从而发出不同的声音。可以弹奏的乐器包括二胡、钢琴和琵琶。
 *  实现思路及关键代码：
 *  1) 定义乐器类Instrument，包括方法makeSound();
 *  2) 定义乐器类的子类：二胡Erhu、钢琴Piano和小提琴Violin;
 *  3) 定义乐手类Musician，可以弹奏各种乐器play(Instrument i);
 *   4) 定义测试类，给乐手不同的乐器让他弹奏。
 * @author Administrator
 *
 */

class Instrument{//乐器类
	public void makeSound() {
		System.out.println("乐器发出声音");
		
	}
	
}

class Erhu extends Instrument{//乐器类的子类：二胡
	public void makeSound() {
		System.out.println("二胡发出声音");
	}
}

class Piano extends Instrument{//乐器类的子类：钢琴
	public void makeSound() {
		System.out.println("钢琴发出声音");
	}
}

class Violin extends Instrument{//乐器类的子类：小提琴
	public void makeSound() {
		System.out.println("小提琴发出声音");
	}
}

class Musician{//乐手类
	public void play(Instrument i) {//弹奏各种乐器
		i.makeSound();
		
	}
}
class testInstrument{//测试类
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
