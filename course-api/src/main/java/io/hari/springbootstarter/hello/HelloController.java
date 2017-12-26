package io.hari.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/welcome")
	public String sayHi()
	{
		return "Hi";
	}

}
