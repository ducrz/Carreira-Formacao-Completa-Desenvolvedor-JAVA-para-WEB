package com.abctreinamentos;
// Generated 21 de jul de 2021 17:06:27 by Hibernate Tools 5.5.3.Final

import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/**
 * Home object for domain model class Curso.
 * @see com.abctreinamentos.Curso
 * @author Hibernate Tools
 */
public class CursoDAO {

	private static final Logger logger = Logger.getLogger(CursoDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() { //Gera a Sessao
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				return sessionFactory;
	}

	public void persist(Curso transientInstance) {
		logger.log(Level.INFO, "persisting Curso instance");
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
	public void delete(Curso persistentInstance) {
		logger.log(Level.INFO, "deleting Curso instance");
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
	public void merge(Curso detachedInstance) {
		logger.log(Level.INFO, "merging Curso instance");
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

public  List<Curso> findAll() {
	logger.log(Level.INFO, "getting all Cursos");
	try {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		//HQL
		String hql="from Curso";
		Query query = session.createQuery(hql);
		List<Curso> cursos = query.list();	
		session.getTransaction().commit();
		return cursos;		
		
	} catch (RuntimeException re) {
		logger.log(Level.SEVERE, "merge failed", re);
		throw re;
	}
}

public  Curso find(long cdcurso) {
	logger.log(Level.INFO, "getting Curso instance");
	try {
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction();
		
		Curso instance = (Curso) sessionFactory.getCurrentSession().get("com.abctreinamentos.Curso", cdcurso);
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
