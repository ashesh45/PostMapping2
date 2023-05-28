package com.api.book.services;
import java.util.ArrayList;
import java.util.List;

import com.api.book.entities.Book;

public class BookService {
	
	private static List<Book> list=new ArrayList<>();
	
	static {
		list.add(new Book(12,"Java","ABC"));
		list.add(new Book(14,"Python","Alk"));
		list.add(new Book(16,"Machine Learning","pow"));
	}
	
	//get all books
	public List<Book> getAllBooks()
	{
		return list;
	}

}
