package com.javamelody.dao;

import com.javamelody.entity.Student;

public interface StudentDao extends GenericDao {

	public abstract void addStudent(Student student);
}
