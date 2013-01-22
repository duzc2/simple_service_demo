package net.duzc2.test.service.testservice1.impl;

import net.duzc2.test.service.testservice1.IService;

public class ServiceImpl implements IService {

	@Override
	public void print(Object o) {
		System.err.println("print by impl:"+o);
	}

}
