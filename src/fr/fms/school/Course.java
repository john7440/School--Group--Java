package fr.fms.school;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
// La classe Course pour gérer les cours
public class Course {
	private String name;
	private String classroom;
	private Teacher teacher;
	private LocalDate startDate;
	private LocalDate endDate;
	private List<Student> students;

    // les constructeurs
	public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate, List<Student> students) {
		setName(name);
		setClassroom(classroom);
		setTeacher(teacher);
		setStartDate(startDate);
		setEndDate(endDate);
		this.students = students;
	}
	
	public Course(String name, String classroom, Teacher teacher, LocalDate startDate, LocalDate endDate) {
        setName(name);
        setClassroom(classroom);
        setTeacher(teacher);
        setStartDate(startDate);
        setEndDate(endDate);
		this.students = new ArrayList<>();
	}

    public Course(String name, String classroom, LocalDate startDate, LocalDate endDate) {
        setName(name);
        setClassroom(classroom);
        setStartDate(startDate);
        setEndDate(endDate);
        this.students = new ArrayList<>();
    }

    //Les Getter et Setter
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
	
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}

    // Les méthodes
	public void addStudent(Student student) {
        this.students.add(student);
	}

	@Override
	public String toString() {
		return "Cours:" + getName() + "\nLieu: " + getClassroom()  + "\nDébut: " + getStartDate()
				+ "\nFin: " + getEndDate() + "\nListe d'élèves: " + getStudents().toString();
	}

}
