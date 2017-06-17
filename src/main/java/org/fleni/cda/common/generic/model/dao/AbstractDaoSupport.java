package org.fleni.cda.common.generic.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang.Validate;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public abstract class AbstractDaoSupport {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * @return
	 */
	protected EntityManager getEntityManager() {
		return this.entityManager;
	}

	/**
	 * @return
	 */
	protected final Session getHibernateSession() {
		Session session = entityManager.unwrap(Session.class);
		Validate.notNull(session, "Error Session Hibernate.");
		return session;
	}

}
