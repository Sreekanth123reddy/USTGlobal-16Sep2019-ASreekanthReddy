package com.ustglobal.lms.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.dto.BooksRegistration;
import com.ustglobal.lms.dto.Users;
import com.ustglobal.lms.service.LibrarianService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*", allowCredentials = "true")
public class LibrarianController {

	@Autowired
	private LibrarianService service;

	@PostMapping(path = "/library/librarian/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Boolean addBooks(@RequestBody BooksInventory booksInventory) {
		boolean isAdded = false;

		service.addBooks(booksInventory);
		isAdded = true;

		return isAdded;
	}

	@GetMapping(path = "/library/librarian/getBooks",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BooksInventory> showAllBook() {
		return service.showAllBooks();

	}

	@DeleteMapping(path = "/library/librarian/{bookId}")
	public Boolean deleteBook(@PathVariable("bookId") int bookId) {
		boolean isDeleted = false;
		service.deleteBook(bookId);
		isDeleted = true;
		return isDeleted;
	}
	@GetMapping(path="/library/librarian/viewRequest",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<BooksRegistration> viewRequests() {
		List<BooksRegistration> booksRegistrations = null;
		booksRegistrations = service.viewRequest();
		return booksRegistrations;
	}
	@PostMapping(path="/library/librarian/user" ,consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Users addStudent(@RequestBody Users users) {
		users = service.registerStudent(users);
		return users;
	}
	@DeleteMapping(path="/library/librarian/deleteStudent/{id}")
	public Boolean deleteStudent(@PathVariable("id") int id) {
		
		boolean isDeleted = service.deleteStudent(id);
		
		return isDeleted;
	}
	@GetMapping(path="/library/librarian/getStudent/{id}")
	public Users getStuentInfo(@PathVariable("id")int id) {
		Users users = null;
		users = service.getStudentInfo(id);
		return users;
	}

}
