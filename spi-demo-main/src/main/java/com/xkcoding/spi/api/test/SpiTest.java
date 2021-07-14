package com.xkcoding.spi.api.test;

import com.xkcoding.spi.api.SpiDemo;

import java.util.ServiceLoader;

/**
 * @author liujianyong
 */
public class SpiTest {
	public static void main(String[] args) {
		ServiceLoader<SpiDemo> serviceLoader = ServiceLoader.load(SpiDemo.class);
		for (SpiDemo o : serviceLoader) {
			o.say();
		}
	}
}