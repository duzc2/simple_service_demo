package net.duzc2.test.service.testservice1.impl;

import net.duzc2.test.service.testservice1.IService;

public class ServiceImpl1 implements IService {

	@Override
	public void print(Object o) {
		System.out.println("print by impl1:" + o);
	}

}
