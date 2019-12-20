package com.ustglobal.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestManytoMany {
	public static void main(String[] args) {
		Course course= new Course();
		course.setCid(101);
		course.setName("java");
		
		Course course1= new Course();
		course1.setCid(102);
		course1.setName("sql");
		ArrayList<Course> al = new ArrayList<Course>();
		al.add(course);
		al.add(course1);
		Student student = new Student();
		student.setSid(1);
		student.setSname("Sreekanth");
		student.setCourses(al);
		
		Student student1 = new Student();
		student1.setSid(2);
		student1.setSname("Siri");
		student1.setCourses(al);


		EntityTransaction entityTransaction =null;
		EntityManager entityManager =null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test");
			entityManager  = entityManagerFactory.createEntityManager();
			entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.persist(student);
			entityManager.persist(student1);
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
