package com.cricworm.cricworm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cricworm.cricworm.entity.Book;

@Repository
@Transactional
public class BookRepository {

	@Autowired
	EntityManager em;
	
	public void playWithEM(){
		List<Book> q=em.createQuery("select b from Book b").getResultList();
	    q.stream().forEach(p -> System.out.println(p.getAuthors().get(0)));
	}
}
