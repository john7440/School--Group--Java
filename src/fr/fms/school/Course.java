package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
	private String name;
	private String classroom;
	private Teacher teacher;
	private LocalDate startDate;
	private LocalDate endDate;
	private ArrayList<Student> students;
	
	
	
	public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate, ArrayList<Student> students) {
		this.name = name;
		this.classroom = classroom;
		this.teacher = teacher;
		this.startDate = startDate;
		this.endDate = endDate;
		this.students = students;
	}
	
	public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate) {
		this.name = name;
		this.classroom = classroom;
		this.teacher = teacher;
		this.startDate = startDate;
		this.endDate = endDate;
		this.students = new ArrayList<>();
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getClassroom() {
		return classroom;
	}
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	
}
