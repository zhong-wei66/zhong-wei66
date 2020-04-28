package com.zw.java300_13.builder;
/**
 * ������ʵ����
 * @author Administrator
 *
 */
public class ZwAirShipBuilder implements AirShipBuilder {//..builder����ʵ����

	@Override
	public Engine builderEngine() {
		System.out.println("������΢�Ʒ�������");
		return new Engine("��΢�Ʒ�������");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("������΢�ƹ���գ�");
		return new OrbitalModule("��΢�ƹ���գ�");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("������΢����������");
		return new EscapeTower("��΢����������");
	}
	
}
