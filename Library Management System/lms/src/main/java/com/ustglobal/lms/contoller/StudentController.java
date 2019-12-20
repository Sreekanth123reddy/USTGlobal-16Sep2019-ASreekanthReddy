package com.ustglobal.lms.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.service.StudentService;
import com.ustglobal.lms.service.StudentServiceImpl;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class StudentController {


	@Autowired
	StudentService service = new StudentServiceImpl();
	
	@PostMapping(path="/library/librarian/getBooks/{bookId}",consumes = MediaType.APPLICATION_JSON_VALUE,produces =MediaType.APPLICATION_JSON_VALUE)
	public List<BooksInventory> searchBook(@RequestBody BooksInventory booksInventory,@PathVariable("bookId")int bookId) {
		List<BooksInventory> bookList = null;
			bookList = service.searchBook(booksInventory);
			return bookList;
	}
	@GetMapping(path="library/student/book/requset/{bookId}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean requestBook(@PathVariable("bookId") int bookId) {
		boolean isRequested = false;
			service.requestBook(bookId);
			isRequested = true;
			return isRequested;
	}

	
}
