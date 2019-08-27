package br.com.demomvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.demomvc.entity.HelloWorld;

@Repository
@Transactional
public class HelloWorldDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public void save(HelloWorld hello) {
		em.persist(hello);
	}
	
	public HelloWorld findById(Long id) {
		HelloWorld find = em.find(HelloWorld.class, id);
		return find;
	}
}
