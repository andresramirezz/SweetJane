/**
 * 
 */
package com.uvm.sweetjane.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Cynthia Mejia
 * @author Dyana Montoya
 * @author Andres Ramirez
 *	Token: 27a4b00c-1b54-402b-9b6c-396cdab28b23
 *	user: andresramirezz@hotmail.com
 */

@Controller
public class MainController {

	@GetMapping({"/","/login"})
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
