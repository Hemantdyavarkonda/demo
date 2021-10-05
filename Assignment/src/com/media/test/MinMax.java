package com.media.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.media.student.Student;

public class MinMax {

	public static void main(String[] args) {
		
		List<Student> s = new ArrayList<>();
		s.add(new Student("abc",5,65.4,80));
		s.add(new Student("pqr",5,70.0,90));
		s.add(new Student("xyz",5,54.4,55));
		s.add(new Student("mno",4,89.2,67));
		s.add(new Student("efg",4,75.5,93));
		s.add(new Student("hij",6,45.7,82));
		s.add(new Student("stv",6,95.9,54));
		s.add(new Student("uvw",6,65.0,76));
		
		
		
//		double max=0;
//		for(Student i: s) {
//			if(i.getGrade()==5) {
//				if(max<i.getTotal_marks()) {
//					max = i.getTotal_marks();
//				}
//			}
//		}
//		System.out.println(max);
		
		//System.out.println(s.stream().min(( d1, d2) -> (d1.getTotal_marks() > d2.getTotal_marks())? -1: (d1.getTotal_marks() > d2.getTotal_marks()) ? 1 : 0).get());
		
		//Integer min = s.stream().min((i1,i2)->i1.getTotal_marks().compareTo(i2.getTotal_marks())).get();
		Optional<Double> total_marks = s.stream().filter(i -> i.getGrade()==5).map(i -> i.getTotal_marks()).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println("Maximum Total marks in grade 5 student "+total_marks.get());
		
		Optional<Double> total_marks1 = s.stream().filter(i -> i.getGrade()==5).map(i -> i.getTotal_marks()).sorted().findFirst();
		System.out.println("Manimum Total marks in grade 5 student "+total_marks1.get());
	}

}
