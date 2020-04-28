package com.zw.java300_13.builder;
/**
 * 构建者实现类
 * @author Administrator
 *
 */
public class ZwAirShipBuilder implements AirShipBuilder {//..builder属于实现类

	@Override
	public Engine builderEngine() {
		System.out.println("构建钟微牌发动机！");
		return new Engine("钟微牌发动机！");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("构建钟微牌轨道舱！");
		return new OrbitalModule("钟微牌轨道舱！");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("构建钟微牌逃逸塔！");
		return new EscapeTower("钟微牌逃逸塔！");
	}
	
}
