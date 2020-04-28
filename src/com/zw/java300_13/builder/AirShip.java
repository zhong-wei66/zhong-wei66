package com.zw.java300_13.builder;
/**
 * ����ɴ�
 * @author Administrator
 *
 */
public class AirShip {
	private OrbitalModule orbitalModule;//�����
	private Engine engine;//������
	private EscapeTower escapeTower;//������
	
	public void launch() {
		System.out.println("���䣡");
	}
	
	//�ṩ��Ӧ��get��set����
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
	
	//�ṩ���ι�����
	public OrbitalModule(String name) {
		super();
		this.name = name;
	}

	//�ṩ��Ӧ��get��set����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

class Engine{
	private String name;
	
	//�ṩ���ι�����
	public Engine(String name) {
		super();
		this.name = name;
	}

	//�ṩ��Ӧ��get��set����
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}

class EscapeTower{
	private String name;
	
	//�ṩ���ι�����
	public EscapeTower(String name) {
		super();
		this.name = name;
	}

	//�ṩ��Ӧ��get��set����
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
		
}
