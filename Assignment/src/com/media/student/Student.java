package com.media.student;

public class Student {
	private String name;
	private int grade;
	private double attendance_percentage;
	private double total_marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getAttendance_percentage() {
		return attendance_percentage;
	}
	public void setAttendance_percentage(float attendance_percentage) {
		this.attendance_percentage = attendance_percentage;
	}
	public double getTotal_marks() {
		return total_marks;
	}
	public void setTotal_marks(double total_marks) {
		this.total_marks = total_marks;
	}
	public Student(String name, int grade, double d, double total_marks) {
		super();
		this.name = name;
		this.grade = grade;
		this.attendance_percentage = d;
		this.total_marks = total_marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", attendance_percentage=" + attendance_percentage
				+ ", total_marks=" + total_marks + "]";
	}
	
	

}
