package com.manymany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ManyToManyMain 
{
public static void main(String[] args) 
{
	EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	Student student1=new Student();
	student1.setName("srikanth");
	student1.setPhno(778040455);
	student1.setMarks(88);
	student1.setAge(22);
	
	Student student2=new Student();
	student2.setName("sumanth");
	student2.setPhno(888040455);
	student2.setMarks(98);
	student2.setAge(23);
	
	Student student3=new Student();
	student3.setName("surendra");
	student3.setPhno(998040455);
	student3.setMarks(78);
	student3.setAge(27);
	
	Student student4=new Student();
	student4.setName("mani");
	student4.setPhno(668040455);
	student4.setMarks(68);
	student4.setAge(20);
	
	
	
	Course course1=new Course();
	course1.setName("Telugu");
	course1.setFees(3333);
	course1.setTrainer("nirmal");
	
	Course course2=new Course();
	course2.setName("Hindi");
	course2.setFees(2222);
	course2.setTrainer("uday");
	
	Course course3=new Course();
	course3.setName("English");
	course3.setFees(4000);
	course3.setTrainer("venu");
	
	Course course4=new Course();
	course4.setName("Maths");
	course4.setFees(6666);
	course4.setTrainer("vinod");
	
	Course course5=new Course();
	course5.setName("physics");
	course5.setFees(6666);
	course5.setTrainer("Anil");
	
	Course course6=new Course();
	course6.setName("social");
	course6.setFees(4466);
	course6.setTrainer("vinay");
	
	List<Student> list1=new ArrayList<Student>();
	list1.add(student1);
	list1.add(student2);
	
	List<Student> list2=new ArrayList<Student>();
	list2.add(student2);
	list2.add(student3);
	
	List<Student> list3=new ArrayList<Student>();
	list3.add(student4);
	list3.add(student4);
	
	List<Course> list4=new ArrayList<Course>();
	list4.add(course4);
	list4.add(course6);
	list4.add(course3);
	
	List<Course> list5=new ArrayList<Course>();
	list5.add(course4);
	list5.add(course3);
	list5.add(course5);
	
	List<Course> list6=new ArrayList<Course>();
	list6.add(course1);
	list6.add(course2);
	list6.add(course5);
	
	student1.setCourses(list4);
	student2.setCourses(list5);
	student3.setCourses(list6);
	student4.setCourses(list5);
	
	course1.setStudents(list1);
	course2.setStudents(list3);
	course3.setStudents(list2);
	course4.setStudents(list2);
	course5.setStudents(list3);
	course6.setStudents(list1);
	
	entityTransaction.begin();
	entityManager.persist(student1);
	entityManager.persist(student2);
	entityManager.persist(student3);
	entityManager.persist(student4);
	entityManager.persist(course1);
	entityManager.persist(course2);
	entityManager.persist(course3);
	entityManager.persist(course4);
	entityManager.persist(course5);
	entityManager.persist(course6);
	entityTransaction.commit();
	
}
}
