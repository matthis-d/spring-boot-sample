package com.sqli.springboot.dao;

import java.util.Collection;

import com.sqli.springboot.domain.Book;

/**
 * The Interface BookDao.
 */
public interface BookDao {
	
	/**
	 * Gets all books.
	 *
	 * @return all books
	 */
	public Collection<Book> getAllBooks();
	
	/**
	 * Gets the book by id.
	 *
	 * @param id the id
	 * @return the book by id
	 */
	public Book getBookById(Long id);
	
	/**
	 * Find books by author.
	 *
	 * @param author the author
	 * @return the collection of books found
	 */
	public Collection<Book> findBooksByAuthor(String author);
	
	/**
	 * Adds the book.
	 *
	 * @param newBook the new book
	 * @return the book added
	 */
	public Book addBook(Book newBook);
	
	/**
	 * Delete book.
	 *
	 * @param bookId the book id
	 */
	public void deleteBook(Long bookId);
	
	/**
	 * Update book.
	 *
	 * @param updatedBook the updated book
	 * @return the book
	 */
	public Book updateBook(Long bookId, Book updatedBook);

}
