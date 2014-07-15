package com.javamelody.dao;

import org.springframework.stereotype.Repository;

import com.javamelody.entity.Cource;

@Repository
public interface CourceDao extends GenericDao {

	
	public abstract void addCource(Cource cource);
	
	public abstract Cource selectById(int id);
	
	public abstract void updateCourceById(Cource cource);
}
