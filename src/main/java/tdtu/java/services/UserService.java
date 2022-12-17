package tdtu.java.services;

import tdtu.java.models.User;

public interface UserService {
	public User createUser(User user);

	public String getRoleFromLogin(String username, String password);
	
	public User getUserByUsername(String username);

}
