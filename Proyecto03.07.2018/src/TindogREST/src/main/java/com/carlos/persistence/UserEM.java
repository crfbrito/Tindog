package com.carlos.persistence;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.carlos.models.User;


public class UserEM extends EntityManager {
	private static UserEM instance = null;

	public static final UserEM getInstance() {
		if (instance == null)
			instance = new UserEM();
		return instance;
	}

	private UserEM() {
		super();
	}

	public User getUserByEmailAndPass(String email, String password) throws Exception{
		User usuario = null;

		Session session = factory.openSession();
		usuario = session.createQuery("FROM User WHERE email=:email AND password=:pass", User.class).setParameter("email", email).setParameter("pass", password).getSingleResult();
		session.close();

		return usuario;
	}
	
	public boolean deleteUser(int uid) throws Exception{
		boolean isOk = false;

		User usuario = null;
		Session session = factory.openSession();
		usuario = (User) session.createQuery("DELETE FROM User WHERE userId =?", User.class);
		session.close();
		
		isOk = true;

		return isOk;
	}
	
	public boolean deleteUser(User aUser) throws Exception{
		boolean isOk = false;

		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		session.delete(aUser);

		t.commit();
		session.close();
		
		isOk = true;

		return isOk;
	}


}
