package com.mongo.example.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.example.model.Book;
import com.mongo.example.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	private BookService service;

	@PostMapping
	public String createBookEntry(@RequestBody Book book) {
		service.addBook(book);

		return "Added successfully";
	}

	@GetMapping
	public List<Book> fetchAllBooks() {
		return service.fetchBooks();
	}

	@PutMapping("/{id}")
	public String updateBook(@PathVariable String id, @RequestBody Book book) {
		service.updateBook(id, book);
		return "Updated Successfully!";
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable String id) {
		service.deleteBook(id);

		return "Deleted Successfully";
	}

}
