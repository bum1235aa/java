package tdtu.java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import tdtu.java.models.Book;
import tdtu.java.repositories.BookRepository;
@Transactional
@Service("bookService")
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRespository;
	
	@Override
	public Iterable<Book> findAll(){
		return bookRespository.findAll();
	}

}
