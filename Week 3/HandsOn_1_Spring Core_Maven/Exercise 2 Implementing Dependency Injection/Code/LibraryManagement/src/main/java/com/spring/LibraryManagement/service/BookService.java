package com.spring.LibraryManagement.service;
import com.spring.LibraryManagement.repository.*;

public class BookService {
	private BookRepository obj;

	public BookService(BookRepository obj) {
		this.obj = obj;
	}
	
	public void showBooks() {
		System.out.println("BookService is calling BookRepository...");
		obj.getBooks();
	}
	

}
