package com.mongo.example.model;

public class BookResponse {
	private String bookId;
	private String bookTitle;
	private String authorName;

	public BookResponse() {

	}

	public BookResponse(String bookId, String bookTitle, String authorName) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.authorName = authorName;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
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
		return "BookResponse [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authorName=" + authorName + "]";
	}

}
