package com.cjc.serviceInterface;

import java.util.List;

import com.cjc.model.Student;

public interface SrviceInterface {
	
	public void register(Student stud);
	public List<Student> logincheck(Student stu);
	public List<Student> delete(int rollno);
	public Student getstudnet(int rollno);
	public List<Student> update(Student stud);

}
