package com.oliver.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

	@GetMapping(path = "/servicea")
	public String whatsupService() {
		return "Service A";
	}

	@GetMapping(path = "/servicea-bean")
	public ServiceA serviceA() {
		return new ServiceA("Service A Bean");
	}
	
	@GetMapping(path = "/service-a/path-variable/{name}")
	public ServiceA whatsupPathVariable(@PathVariable String name) {
		return new ServiceA(String.format("Service A, %s", name));
	}
}
