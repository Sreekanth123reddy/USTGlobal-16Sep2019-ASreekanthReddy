package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateWithJPQL {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction = null;
	try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "update ProductInfo set pname='watch' where pid=101";
		Query query = entityManager.createQuery(jpql);
		int result = query.executeUpdate();
		System.out.println(result);
		entityTransaction.commit();
	} catch (Exception e) {
		e.printStackTrace();
		 entityTransaction.rollback();
	
	}
	entityManager.close();
			}
}
