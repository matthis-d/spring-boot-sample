package com.sqli.springboot.domain;

/**
 * The Class Book.
 *
 * @author matthis-d
 */
public class Book {
	
	/** The id. */
	private Long id;
	
	/** The title. */
	private String title;
	
	/** The author. */
	private String author;
	
	/** The pages. */
	private Integer pages;
	
	/**
	 * Instantiates a new book.
	 */
	public Book() {
	}
	
	/**
	 * Instantiates a new book with arguments.
	 *
	 * @param id the book id
	 * @param title the book title
	 * @param author the book author
	 * @param pages the book pages number
	 */
	public Book(Long id, String title, String author, Integer pages) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.pages = pages;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the pages number.
	 *
	 * @return the pages number
	 */
	public Integer getPages() {
		return pages;
	}

	/**
	 * Sets the pages number.
	 *
	 * @param pages the new pages number
	 */
	public void setPages(Integer pages) {
		this.pages = pages;
	}

	
}
