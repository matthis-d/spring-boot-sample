package com.sqli.springboot.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sqli.springboot.domain.Book;
import com.sqli.springboot.service.BookService;

/**
 * The Class BookController.
 */
@RestController("bookController")
@RequestMapping(value = "/books")
public class BookController {

	/** The book service. */
	@Autowired
	private BookService bookService;
	
	/**
	 * Gets the all books.
	 *
	 * @return the all books
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Collection<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	/**
	 * Gets the book by id.
	 *
	 * @param id the id
	 * @return the book by id
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Book getBookById(@PathVariable("id") Long id) {
		return bookService.getBookById(id);
	}
	
	/**
	 * Find books by author.
	 *
	 * @param authorName the author name
	 * @return the collection
	 */
	@RequestMapping(value = "/author/{name}", method = RequestMethod.GET)
	public Collection<Book> findBooksByAuthor(@PathVariable("name") String authorName) {
		return bookService.findBooksByAuthor(authorName);
	}
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the book
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST, consumes = "application/json")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	/**
	 * Delete book.
	 *
	 * @param id the id
	 * @return the response entity
	 */
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<String> deleteBook(@PathVariable("id") Long id) {
		
		bookService.deleteBook(id);
		return new ResponseEntity<String>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public Book updateBook(@PathVariable("id") Long id, @RequestBody Book book) {
		
		return bookService.updateBook(id, book);
	}
	

	/**
	 * Gets the book service.
	 *
	 * @return the book service
	 */
	public BookService getBookService() {
		return bookService;
	}

	/**
	 * Sets the book service.
	 *
	 * @param bookService the new book service
	 */
	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}
	
}
