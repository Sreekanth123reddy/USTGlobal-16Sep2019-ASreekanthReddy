package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.BooksInventory;

public interface StudentService {


	public List<BooksInventory> searchBook(BooksInventory booksInventory);
	public Boolean requestBook(int bookId);
}
