package com.ustglobal.lms.dao;

import java.util.List;

import com.ustglobal.lms.dto.BooksInventory;

public interface StudentDAO {

	public List<BooksInventory> searchBook(BooksInventory booksInventory);
	public Boolean requestBook(int bookId);

}
