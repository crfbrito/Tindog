package com.carlos.persistence;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.carlos.modelos.Usuario;

public class UserEM extends EntityManager {

	private static UserEM instance = null;

	public static final UserEM getInstance() throws Exception {
		if (instance == null)
			instance = new UserEM();

		return instance;
	}

	public UserEM() {
		super();
	}

	public final List<Usuario> getLista() {
		List<Usuario> usuarios = null;

		try {

			Session session = factory.openSession();
			Transaction t = session.beginTransaction();
			usuarios = session.createQuery("FROM Usuario", Usuario.class).getResultList();
			t.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return usuarios;
	}

	public boolean save(Usuario usu) {
		Session session = factory.openSession();

		Transaction t = session.beginTransaction();
		session.save(usu);
		t.commit();

		session.close();
		return true;
	}

}