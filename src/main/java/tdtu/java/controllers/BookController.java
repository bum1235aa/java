package tdtu.java.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tdtu.java.models.User;
import tdtu.java.services.BookService;
import tdtu.java.services.UserService;

@Controller

public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private UserService userService;
	

	@GetMapping({"/","/home"})
	public String bookPage(ModelMap modelMap) {
		modelMap.put("book",bookService.findAll());
		return "home";
	}
	@PostMapping("/signin")
	public String signin(@RequestParam(name="username") String username,@RequestParam(name="password") String password,ModelMap model) {
		String role = userService.getRoleFromLogin(username, password);
		System.out.print(role);
		if(role==null) {
			
			return "redirect:/";
		}else if(role == "admin") {
			return "/admin/";
		}
		else{
			model.put("user",userService.getUserByUsername(username));
			return "redirect:/";
		}
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
			return "redirect:/login";
		}
		else {
			return "redirect:/register";
		}
	}
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@GetMapping("/book/{id}")
	public String bookReview(@PathVariable int id,ModelMap model) {
		System.out.print(id);
		model.put("book",bookService.findById(id));
		return "review";
	}
}
