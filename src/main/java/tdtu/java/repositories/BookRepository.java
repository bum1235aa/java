package tdtu.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tdtu.java.models.Book;

@Repository("bookRepository")
public interface BookRepository extends JpaRepository<Book, Integer> {
	
	Book findById(int id);
}