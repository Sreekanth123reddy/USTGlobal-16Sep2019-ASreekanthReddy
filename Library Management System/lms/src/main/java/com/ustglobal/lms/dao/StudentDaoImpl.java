package com.ustglobal.lms.dao;

import java.util.List;
import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.BooksInventory;
import com.ustglobal.lms.dto.BooksRegistration;
@Repository
public class StudentDaoImpl implements StudentDAO{

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public List<BooksInventory> searchBook(BooksInventory booksInventory) {
		List<BooksInventory> booksInventories = null;
		EntityManager manager = factory.createEntityManager();
		TypedQuery<BooksInventory> query = manager.createQuery("from BooksInventory where bookId =:bId", BooksInventory.class);
		query.setParameter("bId", booksInventory.getBookId());
		
		booksInventories = query.getResultList();
		return booksInventories;
	}

	@Override
	public Boolean requestBook(int bookId) {
		Random random = new Random();
		BooksRegistration booksRegistration = new BooksRegistration();
		booksRegistration.setId(LogInDaoImpl.sid);
		booksRegistration.setBookId(bookId);
		booksRegistration.setRegistrationId(random.nextInt(10000));
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		manager.persist(booksRegistration);
		manager.getTransaction().commit();
		manager.close();
		return true;

	}

}
