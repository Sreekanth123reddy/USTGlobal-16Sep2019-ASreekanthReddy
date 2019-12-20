package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.LibrarianDAO;
import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.dto.BooksRegistration;
import com.ustglobal.lms.dto.Users;

@Service
public class LibrarianServiceImpl implements LibrarianService{
	@Autowired
	private LibrarianDAO dao;

	@Override
	public Boolean addBooks(BooksInventory booksInventory) {
		return dao.addBooks(booksInventory);
	
	}

	@Override
	public List<BooksInventory> showAllBooks() {
		return dao.showAllBooks();
	}

	@Override
	public Boolean deleteBook(int bookId) {
		return dao.deleteBook(bookId);
	}

	@Override
	public List<BooksRegistration> viewRequest() {
		return dao.viewRequest();
	}

	@Override
	public Users registerStudent(Users user) {
		return dao.registerStudent(user);
	}

	@Override
	public Boolean deleteStudent(int id) {
		return dao.deleteStudent(id);
	}

	@Override
	public Users getStudentInfo(int id) {
		return dao.getStudentInfo(id);
	}

}
