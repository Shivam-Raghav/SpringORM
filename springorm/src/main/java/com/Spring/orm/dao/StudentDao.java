package com.Spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import org.springframework.transaction.annotation.Transactional;

import com.Spring.orm.entities.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Student student) {

		Integer i = (Integer) this.hibernateTemplate.save(student);
		return i;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
