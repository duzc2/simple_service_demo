package net.duzc2.test.service.testservice1.client;

import java.util.ServiceLoader;

import net.duzc2.test.service.testservice1.IService;

public class ServiceClient {
	private static ServiceLoader<IService> codecSetLoader = ServiceLoader
			.load(IService.class);

	public static void main(String[] args) {
		System.out.println("start");

		for (IService s : codecSetLoader) {
			s.print("out");
		}
		System.out.println("finish");
	}
}
