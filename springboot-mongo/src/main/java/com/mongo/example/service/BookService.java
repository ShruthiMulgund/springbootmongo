package com.mongo.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongo.example.model.Book;
import com.mongo.example.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository repository;

	public String addBook(Book book) {
		repository.save(book);

		return "Added successfully";

	}

	public List<Book> fetchBooks() {
		return repository.findAll();
	}

	public String deleteBook(String id) {
		repository.deleteById(id);
		return "deleted successfully";
	}

	public String updateBook(String id, Book book) {
		Optional<Book> foundBook = repository.findById(id);
		if (foundBook.isPresent()) {
			Book updatedBook = foundBook.get();
			updatedBook.setBookTitle(book.getBookTitle());
			updatedBook.setAuthorName(book.getAuthorName());
			repository.save(updatedBook);
		}

		return "Updated Successfully";
	}

}
