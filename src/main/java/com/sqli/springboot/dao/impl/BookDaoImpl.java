package com.sqli.springboot.dao.impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.sqli.springboot.dao.BookDao;
import com.sqli.springboot.domain.Book;

// TODO: Auto-generated Javadoc
/**
 * The Class BookDaoImpl.
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	/** The library. */
	private Collection<Book> library;
	
	/**
	 * Instantiates a new book dao impl.
	 */
	public BookDaoImpl() {
		this.library = new ArrayList<>();
		
		this.library.add(new Book(new Long(1), "Le Petit Prince", "St Exupéry", 120));
		this.library.add(new Book(new Long(2), "L'écume des jours", "Boris Vian", 350));
		this.library.add(new Book(new Long(3), "Le Rouge et le Noir", "Stendhal", 576));
		this.library.add(new Book(new Long(4), "L'Argent", "Zola", 544));
		this.library.add(new Book(new Long(5), "Au bonheur des dames", "Zola", 542));
		
	}
	
	/* (non-Javadoc)
	 * @see com.sqli.springboot.dao.BookDao#getAllBooks()
	 */
	@Override
	public Collection<Book> getAllBooks() {
		return this.library;
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.dao.BookDao#getBookById(java.lang.Long)
	 */
	@Override
	public Book getBookById(Long id) {
		
		for (Book book : this.library) {
			
			if (book.getId().equals(id)) {
				return book;
			}
		}
		
		return null;
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.dao.BookDao#findBooksByAuthor(java.lang.String)
	 */
	@Override
	public Collection<Book> findBooksByAuthor(String author) {
		
		Collection<Book> result = new ArrayList<>();
		
		for (Book book : this.library) {
			
			//TODO: put in lowercase
			if (book.getAuthor().equals(author)) {
				result.add(book);
			}
		}
		
		return result;
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.dao.BookDao#addBook(com.sqli.springboot.domain.Book)
	 */
	@Override
	public Book addBook(Book newBook) {
		
		this.library.add(newBook);
		
		return newBook;
	}

	/* (non-Javadoc)
	 * @see com.sqli.springboot.dao.BookDao#deleteBook(java.lang.Long)
	 */
	@Override
	public void deleteBook(Long bookId) {
		
		Book bookToDelete = this.getBookById(bookId);
		
		this.library.remove(bookToDelete);
	}

}
