package tdtu.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tdtu.java.services.BookService;

@Controller

public class BookController {
	
	@Autowired
	private BookService bookService;
	

	@GetMapping("/")
	public String bookPage(ModelMap modelMap) {
		modelMap.put("book",bookService.findAll());
		return "home";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
}
