package com.zw.java300_13.builder;
/**
 * 宇宙飞船
 * @author Administrator
 *
 */
public class AirShip {
	private OrbitalModule orbitalModule;//轨道舱
	private Engine engine;//发动机
	private EscapeTower escapeTower;//逃逸塔
	
	public void launch() {
		System.out.println("发射！");
	}
	
	//提供相应的get、set方法
	public OrbitalModule getOrbitalModule() {
		return orbitalModule;
	}
	public void setOrbitalModule(OrbitalModule orbitalModule) {
		this.orbitalModule = orbitalModule;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public EscapeTower getEscapeTower() {
		return escapeTower;
	}
	public void setEscapeTower(EscapeTower escapeTower) {
		this.escapeTower = escapeTower;
	}
	
	
}

class OrbitalModule{
	private String name;
	
	//提供带参构造器
	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	//提供相应的get、set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

class Engine{
	private String name;
	
	//提供带参构造器
	public Engine(String name) {
		super();
		this.name = name;
	}

	//提供相应的get、set方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}

class EscapeTower{
	private String name;
	
	//提供带参构造器
	public EscapeTower(String name) {
		super();
		this.name = name;
	}

	//提供相应的get、set方法
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}
