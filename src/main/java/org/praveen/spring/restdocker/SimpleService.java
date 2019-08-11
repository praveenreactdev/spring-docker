package org.praveen.spring.restdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleService {

	@GetMapping("/greet/{name}")
	public String greeting(@PathVariable String name) {
		System.out.println(name + " gave a a request \n");
		return "Hi!! " + name + "\n" + "We got your request";
	}
}
