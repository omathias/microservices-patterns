package com.serviceb.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

	@GetMapping(path = "/serviceb")
	public String whatsupService() {
		return "Service B";
	}

	@GetMapping(path = "/serviceb-bean")
	public ServiceB serviceB() {
		return new ServiceB("Service B Bean");
	}
	
	@GetMapping(path = "/serviceb/path-variable/{name}")
	public ServiceB servicebPathVariable(@PathVariable String name) {
		return new ServiceB(String.format("Service B, %s", name));
	}
}
