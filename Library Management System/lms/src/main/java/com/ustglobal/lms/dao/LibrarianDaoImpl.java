package com.ustglobal.lms.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.dto.BooksRegistration;
import com.ustglobal.lms.dto.Users;
@Repository
public class LibrarianDaoImpl implements LibrarianDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;


	@Override
	public Boolean addBooks(BooksInventory booksInventory) {
		Random random = new Random();
		booksInventory.setBookId(random.nextInt(10000));
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(booksInventory);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}
	@Override
	public List<BooksInventory> showAllBooks() {
		List<BooksInventory> booksInventories = null;
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BooksInventory> query = manager.createQuery("FROM BooksInventory", BooksInventory.class);
		booksInventories = query.getResultList();

		return booksInventories;
	}
	@Override
	public Boolean deleteBook(int bookId) {
		boolean isDeleted = false;
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		BooksInventory booksInventory = manager.find(BooksInventory.class, bookId);
		manager.remove(booksInventory);
		manager.getTransaction().commit();
		isDeleted = true;
		manager.close();
		return isDeleted;
	}
	@Override
	public List<BooksRegistration> viewRequest() {
		List<BooksRegistration> booksRegistrations = null;

		EntityManager manager = factory.createEntityManager();
		TypedQuery<BooksRegistration> typedQuery = manager.createQuery("FROM BooksRegistration", BooksRegistration.class);
		booksRegistrations = typedQuery.getResultList();
		manager.close();
		return booksRegistrations;

	}
	@Override
	public Users registerStudent(Users user)  {
		user.setRole("Student");

		
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(user);
			manager.getTransaction().commit();
			manager.close();
		
		return user;
	}

	@Override
	public Boolean deleteStudent(int id) {
		boolean isDeleted = false;
		
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			Users users = manager.find(Users.class, id);
			manager.remove(users);
			manager.getTransaction().commit();
			isDeleted = true;
			manager.close();
		
		return isDeleted;
	}
	@Override
	public Users getStudentInfo(int id)  {
		Users users = null;
		
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			users = manager.find(Users.class, id);
			manager.getTransaction().commit();
			manager.close();
		
		return users;
	}// end of getStudentInfo()

}
