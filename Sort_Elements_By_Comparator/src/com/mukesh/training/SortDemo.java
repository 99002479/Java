package com.mukesh.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student("1", "Mukesh", 22);
		Student student2 = new Student("2", "Josh", 21);
		Student student3 = new Student("3", "Vijay", 20);
		Student student4 = new Student("6", "Karthi", 23);
		Student student5 = new Student("5", "Rishi", 21); 
		
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(new Student("4", "Dhanush", 20));
		
		for(Student stud: studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList, new NameSort());
		System.out.println("Sorted By Name:");
		for(Student stud: studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList, new Comparator<Student>() {
			@Override
			public int compare(Student stud1, Student stud2) {
				return stud1.getSid().compareTo(stud2.getSid());
			}
		});
		System.out.println("Sorted By ID:");
		for(Student stud: studentList) {
			System.out.println(stud);
		}
		
		Collections.sort(studentList,(stud1, stud2)->{
			return stud1.getAge().compareTo(stud2.getAge());
		});
		System.out.println("Sorted By Age:");
		for(Student stud: studentList) {
			System.out.println(stud);
		}
		
	}

}
