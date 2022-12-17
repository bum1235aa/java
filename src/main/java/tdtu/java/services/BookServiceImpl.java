package tdtu.java.services;

import org.springframework.beans.factory.annotation.Autowired;

import tdtu.java.models.Book;
import tdtu.java.repositories.BookRepository;

public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRespository;
	
	@Override
	public Iterable<Book> findAll(){
		return bookRespository.findAll();
	}

}
