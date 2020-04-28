package com.zw.java300_13.builder;

public class ZwAirShipDirector implements AirShipDirector{
	private AirShipBuilder builder;
	
	//构造器

	public ZwAirShipDirector(AirShipBuilder builder) {
		super();
		this.builder = builder;
	}
	
	@Override
	public AirShip directAirShip() {
		Engine e = builder.builderEngine();
		OrbitalModule o = builder.builderOrbitalModule();
		EscapeTower et = builder.builderEscapeTower();
		
		//装配飞船对象
		AirShip ship = new AirShip();
		ship.setEngine(e);
		ship.setEscapeTower(et);
		ship.setOrbitalModule(o);
		
		return ship;
	}


}
