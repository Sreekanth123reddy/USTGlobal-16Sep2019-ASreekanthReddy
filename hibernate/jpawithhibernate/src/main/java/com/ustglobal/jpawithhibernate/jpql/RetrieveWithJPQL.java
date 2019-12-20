package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class RetrieveWithJPQL {
	public static void main(String[] args) {
		EntityManager entityManager = null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			//String jpql = "from ProductInfo";
			String jpql = "select pname from ProductInfo";
			Query query =entityManager.createQuery(jpql);
			List<String> products = query.getResultList();
			//List<Productinfo> products = query.getResultList();
			for (String String : products) {
				System.out.println(String);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
