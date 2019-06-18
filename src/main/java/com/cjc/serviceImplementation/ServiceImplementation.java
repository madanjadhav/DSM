package com.cjc.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.daoInterface.DaoInterfacae;
import com.cjc.model.Student;
import com.cjc.serviceInterface.SrviceInterface;
@Service
public class ServiceImplementation implements SrviceInterface{

	@Autowired
	DaoInterfacae dao;
	@Override
	public void register(Student stud) {
		dao.save(stud);
		
	}
	@Override
	public List<Student> logincheck(Student stu) {
		List<Student> list=(List<Student>) dao.findAll();
		return list;
	}
	
	@Override
	public List<Student> delete(int rollno) {
		dao.deleteById(rollno);
		return (List<Student>) dao.findAll();
	}
	@Override
	public Student getstudnet(int rollno) {
		Student stud=dao.findById(rollno).get();
		return stud;
	}
	@Override
	public List<Student> update(Student stud) {
		dao.save(stud);
		return (List<Student>) dao.findAll();
	}

}
