package com.ustglobal.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.ProductInfo;

public class ReadDemoo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	ProductInfo productDetail = entityManager.find(ProductInfo.class, 101);
	System.out.println("Id is :"+productDetail.getPid());
	System.out.println("name of product :"+productDetail.getPname());
	System.out.println("quantity :"+productDetail.getQuantity());
}//end of main method
}// end of class
