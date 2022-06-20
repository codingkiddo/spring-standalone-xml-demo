package com.ch03.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class DemoBeanAnnotation {
	@PostConstruct
	public void customInit() {
		System.out.println("Method customInit() invoked...");
	}

	@PreDestroy
	public void customDestroy() {
		System.out.println("Method customDestroy() invoked...");
	}
}
