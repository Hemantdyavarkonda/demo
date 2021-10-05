package com.media.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.media.student.Student;

public class Test {

	public static void main(String[] args) {
		
		
		List<Student> s = new ArrayList<>();
		s.add(new Student("abc",5,65.4,80));
		s.add(new Student("pqr",5,70.0,90));
		s.add(new Student("xyz",5,54.4,85));
		s.add(new Student("mno",4,89.2,67));
		s.add(new Student("efg",4,75.5,93));
		s.add(new Student("hij",6,45.7,82));
		s.add(new Student("stv",6,95.9,54));
		s.add(new Student("uvw",6,65.0,76));
		
		
		System.out.println("Before Sorted List");
		s.forEach(System.out::println);
		Collections.sort(s, ( d1, d2) -> (d1.getTotal_marks() < d2.getTotal_marks())? -1: (d1.getTotal_marks() < d2.getTotal_marks()) ? 1 : 0);
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("After Sorted List");
		s.forEach(System.out::println);
	}

}
