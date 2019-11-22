package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestOneToOne {
	public static void main(String[] args) {
		VoterCard vc = new VoterCard();
		vc.setVid(101);
		vc.setName("Ram");
		Person p =new Person();
		p.setPid(2);
		p.setPname("Ram");
		p.setVoterCard(vc);
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
		 entityManager  = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		 entityTransaction.begin();
		VoterCard vCard = entityManager.find(VoterCard.class, 101);
		System.out.println(vCard.getPerson().getPid());
		System.out.println("Record Saved");
		 //entityManager.persist(p);
		entityTransaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	}

}
