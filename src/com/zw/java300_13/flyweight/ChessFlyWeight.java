package com.zw.java300_13.flyweight;
/**
 * 享元类
 * 围棋软件设计：颜色、形状、大小这些是可以共享的，
 * 称之为内部状态，下列代码以颜色为例
 * @author Administrator
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
	
}

class ConcreteChess implements ChessFlyWeight{
	
	private String color;
	
	public ConcreteChess(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color = c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色："+color);
		System.out.println("棋子位置："+c.getX()+"----"+c.getY());
	}
	
}
