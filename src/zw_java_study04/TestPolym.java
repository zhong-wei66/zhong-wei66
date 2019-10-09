package zw_java_study04;
/**
 * ���Զ�̬
 * @author Administrator
 *
 */

public class TestPolym {
	public static void main(String[] args) {
		Animal a=new Animal();
		animalCry(a);
		
		Dog d=new Dog();//�Զ�����ת��
		animalCry(d);
		animalCry(new Cat());
		
		Dog d2 = (Dog)d;//ǿ������ת��
		d2.seeDoor();
		
	}
	
	static void animalCry(Animal a) {
		a.shout();
		
	}

}


class Animal {
    public void shout() {
        System.out.println("����һ����");
    }
}
class Dog extends Animal {
    public void shout() {
        System.out.println("��������");
    }
    public void seeDoor() {
        System.out.println("������....");
    }
}
class Cat extends Animal {
    public void shout() {
        System.out.println("����������");
    }
}
