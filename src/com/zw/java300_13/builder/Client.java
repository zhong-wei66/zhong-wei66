package com.zw.java300_13.builder;

public class Client {
	public static void main(String[] args) {
		AirShipDirector director = new ZwAirShipDirector(new ZwAirShipBuilder());
		
		AirShip ship = director.directAirShip();
		
		System.out.println(ship.getEngine().getName());
		
		ship.launch();
		
	}
}
