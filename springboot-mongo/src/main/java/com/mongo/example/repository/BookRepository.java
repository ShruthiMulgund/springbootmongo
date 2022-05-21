package com.mongo.example.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.example.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {

	List<Book> findByBookTitle(String bookTitle);

	List<Book> findByAuthorName(String authorName);

}
