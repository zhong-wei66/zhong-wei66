package com.zw.java300_13.proxy.dynamicProxy;

import java.lang.reflect.Proxy;

import com.zw.java300_13.proxy.staticProxy.ProxyStar;

public class Client {
	public static void main(String[] args) {
		Star realStar = new RealStar();
		StarHandler handler = new StarHandler(realStar);
		
		Star proxy = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[] {Star.class}, handler);
		proxy.sing();
	}
}
