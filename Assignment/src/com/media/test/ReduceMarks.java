package com.media.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.media.student.Student;

public class ReduceMarks {
	
	

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
		
//		double reduces;
//		for(Student i : s) {
//			if(i.getGrade()==6) {
//				if(i.getAttendance_percentage()<80.0) {
//					reduces=i.getTotal_marks()-10;
//					System.out.println(reduces);
//				}
//			}
//		}
		
		s.stream().filter(i -> i.getGrade()==6 && i.getAttendance_percentage()<80.0).map(i -> i.getTotal_marks()-10).forEach(t -> System.out.println(t));
		
		

	}

}
