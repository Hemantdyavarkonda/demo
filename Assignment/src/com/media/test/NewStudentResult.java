package com.media.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.media.student.Student;

public class NewStudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<StudentResult> sr = new ArrayList<>();
//		for(Student s: getStudent()) {
//			if(s.getTotal_marks() > 75) {
//				sr.add(new StudentResult(s.getName(),"Pass"));
//				//sr.add("pass");
//			}
//			else {
//				sr.add(new StudentResult(s.getName(),"Fail"));
//			}
//		}
//		for(StudentResult s : sr) {
//			System.out.println(s);
//		}
//		
		//Stream<Student> l = getStudent().stream().filter(i -> i.getTotal_marks()>75);
		//Stream<StudentResult> l1 = sr.forEach((getStudent().stream().map(i -> i.getName()),"Pass") -> );
		List<StudentResult> result = getStudent().stream().filter(i->i.getTotal_marks()>75 && i.getGrade()==5).map((Student s) -> new StudentResult(s.getName(), "Pass")).collect(Collectors.toList());
		result.forEach(System.out::println);
	}
	private static List<Student> getStudent(){
		List<Student> s = new ArrayList<>();
		s.add(new Student("abc",5,65.4,80));
		s.add(new Student("pqr",5,70.0,90));
		s.add(new Student("xyz",5,54.4,85));
		s.add(new Student("mno",5,89.2,67));
		s.add(new Student("efg",4,75.5,93));
		s.add(new Student("hij",6,45.7,82));
		s.add(new Student("stv",6,95.9,54));
		s.add(new Student("uvw",6,65.0,76));
		return s;
	}

}

class StudentResult{
	private String name;
	private String result;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public StudentResult(String name, String result) {
		super();
		this.name = name;
		this.result = result;
	}
	@Override
	public String toString() {
		return "StudentResult [name=" + name + ", result=" + result + "]";
	}
	
	
	
}
