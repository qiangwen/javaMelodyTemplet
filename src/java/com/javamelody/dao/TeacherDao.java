package com.javamelody.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javamelody.entity.Teacher;

@Repository
public interface TeacherDao extends GenericDao{

	public abstract void addTeacher(Teacher teacher);
	
	public abstract Teacher selectTeacerById(int id);
	
	public abstract List<Teacher> selectAll();
	
}
