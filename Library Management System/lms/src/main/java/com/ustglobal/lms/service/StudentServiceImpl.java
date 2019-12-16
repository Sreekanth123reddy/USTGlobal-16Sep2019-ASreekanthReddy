package com.ustglobal.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ustglobal.lms.dao.StudentDAO;
import com.ustglobal.lms.dto.BooksInventory;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO dao;

	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) {
		return dao.searchBook(booksInventory);
	}

	@Override
	public Boolean requestBook(int bookId) {
		return dao.requestBook(bookId);
	}

}
