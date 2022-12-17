package tdtu.java.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdtu.java.models.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsernameAndPassword(String username,String password);
	User findByUsername(String username);
	List<User> findAllByRole(String role);
}
