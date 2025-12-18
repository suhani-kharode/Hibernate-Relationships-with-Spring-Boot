package com.sit.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int studentId;

	    private String studentName;

	    @ManyToMany(cascade = CascadeType.ALL)
	    @JoinTable(
	        name = "student_course",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "course_id")
	    )
	    private Set<Course> course;

		public Student(int studentId, String studentName, Set<Course> course) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.course = course;
		}

		public Student() {
			super();
		}

		public int getStudentId() {
			return studentId;
		}

		public void setStudentId(int studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public Set<Course> getCourse() {
			return course;
		}

		public void setCourse(Set<Course> course) {
			this.course = course;
		}
		
		
		

	    
	    

}
