package com.mukesh.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {

	public static void main(String[] args) {
		Student student1 = new Student("1", "Mukesh", 22);
		Student student2 = new Student("2", "Josh", 21);
		Student student3 = new Student("3", "Vijay", 20);
		Student student4 = new Student("4", "Karthi", 23);
		Student student5 = new Student("5", "Rishi", 21);
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		
		for(Student stud: studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList);
		System.out.println("Sorted List:");
		for(Student stud: studentList) {
			System.out.println(stud);
		}
	} 

}
