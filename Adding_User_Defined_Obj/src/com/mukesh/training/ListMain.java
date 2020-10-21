package com.mukesh.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.*;

import com.mukesh.model.Student;

public class ListMain {

	private static final String Iterator = null;

	public static void main(String[] args) {
		
		List<Student> studentList = new ArrayList<>();
		Student student1 = new Student("1", "Mukesh", 22);
		studentList.add(student1);
		studentList.add(new Student("2", "Josh", 21));
		studentList.add(new Student("3", "Vijay", 20));
		studentList.add(new Student("4", "Karthi", 23));
		studentList.add(new Student("5", "Rishi", 21));
		
		//System.out.println(studentList);
		   
		Iterator<Student> it = studentList.iterator();
		while(it.hasNext()) {
			Student stud = it.next();
			System.out.println(stud);
		}
		
		System.out.println(".............");
		for(Student stud: studentList) {
			System.out.println(stud);
			
		System.out.println("Reverse order");	
		ListIterator<Student> listIter = studentList.listIterator(studentList.size()); 
		
		while(listIter.hasPrevious()) {
			Student student = listIter.previous();
			System.out.println(student);
		}
		}
	}

}
