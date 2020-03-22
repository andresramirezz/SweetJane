/**
 * 
 */
package com.uvm.sweetjane.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Cynthia Mejia
 * @author Dyana Montoya
 * @author Andres Ramirez
 *	Token: 27a4b00c-1b54-402b-9b6c-396cdab28b23
 *	user: andresramirezz@hotmail.com
 */

@Controller
@SpringBootApplication
public class MainController {

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
}
