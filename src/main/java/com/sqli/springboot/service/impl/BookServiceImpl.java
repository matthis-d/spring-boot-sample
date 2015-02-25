package com.sqli.springboot.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqli.springboot.dao.BookDao;
import com.sqli.springboot.domain.Book;
import com.sqli.springboot.service.BookService;

/**
 * The Class BookServiceImpl.
 */
@Service("bookService")
public class BookServiceImpl implements BookService {
	
	/** The book dao. */
	@Autowired
	private BookDao bookDao;

	/* (non-Javadoc)
	 * @see com.sqli.springboot.service.BookService#getAllBooks()
	 */
	@Override
	public Collection<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.service.BookService#getBookById(java.lang.Long)
	 */
	@Override
	public Book getBookById(Long id) {
		return bookDao.getBookById(id);
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.service.BookService#findBooksByAuthor(java.lang.String)
	 */
	@Override
	public Collection<Book> findBooksByAuthor(String author) {
		return bookDao.findBooksByAuthor(author);
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.service.BookService#addBook(com.sqli.springboot.domain.Book)
	 */
	@Override
	public Book addBook(Book newBook) {
		return bookDao.addBook(newBook);
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.service.BookService#deleteBook(java.lang.Long)
	 */
	@Override
	public void deleteBook(Long bookId) {
		bookDao.deleteBook(bookId);
	}

	/**
	 * Gets the book dao.
	 *
	 * @return the book dao
	 */
	public BookDao getBookDao() {
		return bookDao;
	}

	/**
	 * Sets the book dao.
	 *
	 * @param bookDao the new book dao
	 */
	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}

}
