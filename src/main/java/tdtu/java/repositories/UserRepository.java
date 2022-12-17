package tdtu.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdtu.java.models.User;
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String Username);
}
