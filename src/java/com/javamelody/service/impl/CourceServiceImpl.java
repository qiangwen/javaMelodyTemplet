package com.javamelody.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamelody.dao.CourceDao;
import com.javamelody.entity.Cource;
import com.javamelody.service.CourceService;

@Service
public class CourceServiceImpl implements CourceService {
	
	@Autowired
	private CourceDao courceDao;
	
	@Override
	public Cource selectById(int id) {
		
		return courceDao.selectById(id);
	}

}
