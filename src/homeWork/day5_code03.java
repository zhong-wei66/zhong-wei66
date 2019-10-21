package homeWork;
/**
 * 第五章编码题3
 * 3. 编写程序描述影视歌三栖艺人。需求说明：请使用面向对象的思想，设计自定义类，描述影视歌三梄艺人。
 * 实现思路：
 * 1) 分析影视歌三栖艺人的特性：可以演电影，可以演电视剧，可以唱歌
 * 2) 定义多个接口描述特性
 * a) 演电影的接口-----方法：演电影
 * b) 演电视剧的接口-----方法：演电视剧
 * c) 唱歌的接口-----方法：唱歌
 * 3) 定义艺人类实现多个接口
 * 
 *
 */

interface Move{//电影接口
	public abstract void move();
}
interface Tv1{//电视剧接口
	public abstract void tv();
}
interface singsong{//唱歌接口
	public abstract void sing();
}

class Artist implements Move,Tv1,singsong{//接口实现
	
	//构造方法
	public Artist(String name) {		
		System.out.println("大家好，我是" + name);
	}
	
	//普通方法
	public void sing() {
		System.out.println("我能唱歌");
	}
	public void tv() {
		System.out.println("我能演电视剧");	
	}
	public void move() {
		System.out.println("我能演电影");
	}
	
}

public class day5_code03 {
	public static void main(String[] args) {
		Artist a = new Artist("杨幂");
		a.move();
		a.tv();
		a.sing();
	}
}



//
//interface  Artist{//艺人接口
//	public static final String name = "杨幂";
//	public abstract void Feature();//定义一个特征方法
//}
//
//class Move implements Artist{//演电影
//
//	@Override
//	public void Feature() {
//		System.out.println("演电影");
//		
//	}
//}
//
//class Tv implements Artist{//演电视剧
//
//	@Override
//	public void Feature() {
//		System.out.println("演电视剧");
//	}
//	
//}
//
//class Sing implements Artist{
//
//	@Override
//	public void Feature() {
//		System.out.println("唱歌");
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
//		System.out.println("大家好我是："+Artist.name);
//		move.Feature();
//		tv.Feature();
//		sing.Feature();
//	}
//
//}
