package es.upm.dit.isst.edoc.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("check")
	public String helloWorld(@RequestParam(value="name", defaultValue="World") String name) {
		return "200, valid";
	}
}
