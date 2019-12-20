package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class InsertDemo {
public static void main(String[] args) {
	ProductInfo productInfo = new ProductInfo();
	productInfo.setPid(103);
	productInfo.setPname("Eraser");
	productInfo.setQuantity(5);
	
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	EntityManager entityManager  = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(productInfo);
	System.out.println("Record Saved");
	entityTransaction.commit();
	entityManager.close();
}
}
