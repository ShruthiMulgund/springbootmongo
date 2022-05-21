package com.mongo.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
public class Book {
	@Id
	private String id;
	private String bookTitle;
	private String authorName;

	public Book() {
	}

	public Book(String bookTitle, String authorName) {
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	public String getBookId() {
		return id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + id + ", bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}

}
