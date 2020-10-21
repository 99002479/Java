package com.mukesh.training;

import java.util.Comparator;

public class NameSort implements Comparator<Student>{

	@Override
	public int compare(Student stud1, Student stud2) {
		return stud1.getName().compareTo(stud2.getName());
	}
	
}
