package com.zw.java300_13.factory.simplefactory;

public class Client {
	public static void main(String[] args) {
		Car c1 = CarFactory.createCar("°ÂµÏ");
		Car c2 = CarFactory.createCar("±ÈÑÇµÏ");
		
		
		c1.run();
		c2.run();
	}
}
