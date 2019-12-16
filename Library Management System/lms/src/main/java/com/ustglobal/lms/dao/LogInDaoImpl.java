package com.ustglobal.lms.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ustglobal.lms.dto.Users;
@Repository
public class LogInDaoImpl implements LogInDAO{
	@PersistenceUnit
	private EntityManagerFactory factory;
	static int sid;

	@Override
	public Users login(int id, String password) {
		this.sid = id;
		Users bean = null;
		String jpql = "from Users  where id=:id and password=:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Users> query = manager.createQuery(jpql, Users.class);
		query.setParameter("id", id);
		query.setParameter("pass", password);
		
		try {
			 bean =  query.getSingleResult();
		
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return bean;
		
}

	@Override
	public Users register(Users bean) {
		bean.setRole("Librarian");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
		manager.persist(bean);
		transaction.commit();
	
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
		return bean;
	}

}
