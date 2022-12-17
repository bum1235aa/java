package tdtu.java.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tdtu.java.models.User;
import tdtu.java.repositories.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}
	@Override
	public String getRoleFromLogin(String username,String password) {
		User user = userRepository.findByUsernameAndPassword(username, password);
		if(user!=null) {
			return user.getRole();
		}else {
			return null;
		}
	}
	@Override
	public User getUserByUsername(String username) {
		
		return userRepository.findByUsername(username);
	}
	@Override
	public List<User> findByRole(String role) {
		
		return userRepository.findAllByRole(role);
	}
}
