package org.geneation.schoolSystem;

import java.util.Collections;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Course extends Student {
	
	//Attributes
	private String courseName;
	private int year;
	private String professorName;
    
    //constructors
	public Course(String firstName, String lastName, int registration, int grade, int year, String courseName, int year, String professorName) {
		super(firstName, lastName, registration, grade, year);
		this.courseName = courseName;
		this.year = year;
		this.professorName = professorName;
	}
	
	//Collection for all students
	Set<String> students = new HashSet<String>();
    
	
	//Methods
	public void enroll(Student student){
	      //TODO add the student to the collection
		students.add(student);
	   }

	public void unEnroll(Student student){
	       //TODO remove this student from the collection
	       // Hint: check if that really is this student
		if(students.contains((student))) {
			student.remove((student));
		}
	   }

	public int countStudents(){
	       //TODO implement
		int allStudents = students.size;
	       return allStudents;
	   }
	   
	public int bestGrade(){
	       //TODO implement
	List<String> list = new ArrayList<String>(students);
	        Collections.sort(list);
	        int grade = list.get(0);
	       return grade;
	   }
	
	//getters y setters
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getProfessorName() {
		return professorName;
	}

	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}

	public ArrayList<String> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<String> students) {
		this.students = students;
	}
	
	//toString
	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", year=" + year + ", professorName=" + professorName + "]";
	}

	
	
}
