package com.abctreinamentos;
// Generated 21 de jul de 2021 17:06:27 by Hibernate Tools 5.5.3.Final

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Home object for domain model class Pagamento.
 * @see com.abctreinamentos.Pagamento
 * @author Hibernate Tools
 */
public class PagamentoDAO {

	private static final Logger logger = Logger.getLogger(PagamentoDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() { //Gera a Sessao
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				return sessionFactory;
	}

	public void persist(Pagamento transientInstance) {
		logger.log(Level.INFO, "persisting Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(transientInstance);
			session.getTransaction().commit();
			
			
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}
	public void delete(Pagamento persistentInstance) {
		logger.log(Level.INFO, "deleting Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(persistentInstance);
			session.getTransaction().commit();
			
			
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}
	public void merge(Pagamento detachedInstance) {
		logger.log(Level.INFO, "merging Pagamento instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.merge(detachedInstance);
			session.getTransaction().commit();
			
			
			logger.log(Level.INFO, "merge successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

public  List<Pagamento> findAll() {
	logger.log(Level.INFO, "getting all Pagamentos");
	try {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		//HQL
		session.getTransaction().commit();
		
		
		logger.log(Level.INFO, "merge successful");
	} catch (RuntimeException re) {
		logger.log(Level.SEVERE, "merge failed", re);
		throw re;
	}
	return null;
}

public  Pagamento find(PagamentoId id) {
	logger.log(Level.INFO, "getting Pagamento instance");
	try {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Pagamento instance = (Pagamento) sessionFactory.getCurrentSession().get("com.abctreinamentos.Pagamento", id);
		session.getTransaction().commit();		

		if (instance == null) {
			logger.log(Level.INFO, "get successful, no instance found");
		} else {
			logger.log(Level.INFO, "get successful, instance found");
		}
		return instance;
		
	} catch (RuntimeException re) {
		logger.log(Level.SEVERE, "merge failed", re);
		throw re;
	}
}

}
