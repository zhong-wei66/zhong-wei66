package com.zw.java300_13.builder;
/**
 * 该接口用于构建自组件
 * @author Administrator
 *
 */

public interface AirShipBuilder {
	Engine builderEngine();
	OrbitalModule builderOrbitalModule();
	EscapeTower builderEscapeTower();
}
