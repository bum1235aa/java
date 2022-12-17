package tdtu.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tdtu.java.models.User;
import tdtu.java.services.BookService;
import tdtu.java.services.UserService;

@Controller

public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	

	@GetMapping("/")
	public String bookPage(ModelMap modelMap) {
		modelMap.put("book",bookService.findAll());
		return "home";
	}
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	@PostMapping("/createUser")
	public String createUser(@ModelAttribute User user) {
		System.out.print(user.getPassword());
		User data = userService.createUser(user);
		if(data!=null) {
			return "login";
		}
		else {
			return "register";
		}
	}
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
}
