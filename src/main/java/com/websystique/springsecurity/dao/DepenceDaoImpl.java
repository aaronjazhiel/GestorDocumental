package com.websystique.springsecurity.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.websystique.springsecurity.model.Dependece;

@Repository("dependeceDao")
public class DepenceDaoImpl extends AbstractDao<Integer, Dependece> implements DepenceDao {

	public void save(Dependece dependece) {
		persist(dependece);
	}
	
	public Dependece findById(int id) {
		return getByKey(id);
	}

	@SuppressWarnings("unchecked")
	public List<Dependece> findAll() {
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("firstName"));
		return (List<Dependece>)crit.list();
	}

}
