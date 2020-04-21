package com.oliver.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

	@GetMapping(path = "/service-a")
	public String helloWorld() {
		return "Service A";
	}

	@GetMapping(path = "/service-a-bean")
	public ServiceA serviceA() {
		return new ServiceA("Service A Bean");
	}
	
	@GetMapping(path = "/service-a/path-variable/{name}")
	public ServiceA helloWorldPathVariable(@PathVariable String name) {
		return new ServiceA(String.format("Service A, %s", name));
	}
}
