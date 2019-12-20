package com.ustglobal.jpawithhibernate.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestOneToMany {
public static void main(String[] args) {
	PensilBox peBox = new PensilBox();
	peBox.setBid(1);
	peBox.setBname("Apsara");
	
	Pensil  pensil = new Pensil();
	pensil.setPid(11);
	pensil.setColor("Black");
	pensil.setPensilBox(peBox);
	Pensil  pensil1 = new Pensil();
	pensil.setPid(12);
	pensil.setColor("red");
	pensil.setPensilBox(peBox);
	
	EntityManager entityManager = null;
	EntityTransaction entityTransaction = null;
	try {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
	 entityManager  = entityManagerFactory.createEntityManager();
	 entityTransaction = entityManager.getTransaction();
	 entityTransaction.begin();
	 entityManager.persist(pensil);
	 entityManager.persist(pensil1);
	 System.out.println("Record Saved");
	entityTransaction.commit();
	}
	catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();

}
}
