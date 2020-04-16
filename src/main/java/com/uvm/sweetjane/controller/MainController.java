/**
 * 
 */
package com.uvm.sweetjane.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Andres Ramirez
 *	Token: 27a4b00c-1b54-402b-9b6c-396cdab28b23
 *	user: andresramirezz@hotmail.com
 */

@Controller
@SpringBootApplication
public class MainController {

	@RequestMapping({"/","/login"})
	
	public String index() {
		return "index";
	}
	
	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
}