package tdtu.java.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tdtu.java.models.Book;

@Repository("bookRepository")
public interface BookRepository extends CrudRepository<Book, Integer> {
	Book findById(int Id);
}