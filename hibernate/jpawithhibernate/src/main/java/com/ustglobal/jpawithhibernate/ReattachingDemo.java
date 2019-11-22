package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReattachingDemo {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager  = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		
		ProductInfo productDetail = entityManager.find(ProductInfo.class, 101);
		System.out.println(entityManager.contains(productDetail));
		entityManager.detach(productDetail);
		ProductInfo productInfo = entityManager.merge(productDetail);
		productInfo.setPname("Spoon");
		productInfo.setQuantity(2);
		System.out.println("Updated");
		entityTransaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
