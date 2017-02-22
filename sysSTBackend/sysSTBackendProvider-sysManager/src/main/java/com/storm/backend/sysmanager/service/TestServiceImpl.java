package com.storm.backend.sysmanager.service;

import com.storm.backend.api.TestService;


public class TestServiceImpl implements TestService {

	public String sayHello(String name) {
		return "hello: " + name;
	}

}
