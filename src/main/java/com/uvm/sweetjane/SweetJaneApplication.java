package com.uvm.sweetjane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cynthia Mejia
 * @author Dyana Montoya
 * @author Andres Ramirez
 *
 */
@Controller
@SpringBootApplication
public class SweetJaneApplication {
	
    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World! , and Hello from the Hell!!!";
    }

	public static void main(String[] args) {
		SpringApplication.run(SweetJaneApplication.class, args);
	}

}
