package com.xcfh.car.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

public class BaseDao {

	private HibernateTransactionManager htmanager;
	private Session session;

	public HibernateTransactionManager getHtmanager() {

		return htmanager;
	}

	@ Resource(name = "TransactionManager")
	public void setHtmanager(HibernateTransactionManager htmanager) {

		this.htmanager = htmanager;
	}

	public Session getSession() {

		return session;
	}

	public void setSession(Session session) {

		this.session = session;
	}

	public Session getCurrentSession() {

		return (this.session == null || (!this.session.isOpen())) ? (this.session = htmanager.getSessionFactory().openSession()) : this.session;
	}

	public void sessionFlush() {

		this.session.flush();
	}

	public void sessionClose() {

		this.session.close();
	}
}
