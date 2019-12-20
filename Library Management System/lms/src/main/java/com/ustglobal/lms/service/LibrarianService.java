package com.ustglobal.lms.service;

import java.util.List;

import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.dto.BooksRegistration;
import com.ustglobal.lms.dto.Users;

public interface LibrarianService {
	public Boolean addBooks(BooksInventory booksInventory);
	public List<BooksInventory> showAllBooks();
	public Boolean deleteBook(int bookId);
	public List<BooksRegistration> viewRequest();
	public Users registerStudent(Users user);
	public Boolean deleteStudent(int id);
	public Users getStudentInfo(int id);
}
