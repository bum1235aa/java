package tdtu.java.services;

import java.util.List;

import tdtu.java.models.User;

public interface UserService {
	public User createUser(User user);

	public String getRoleFromLogin(String username, String password);
	
	public User getUserByUsername(String username);
	
	public List<User> findByRole(String role);
 
}
