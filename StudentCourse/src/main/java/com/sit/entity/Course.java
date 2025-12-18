package com.sit.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int courseId;

	    private String courseName;

	    @ManyToMany(mappedBy = "course")
	    private Set<Student> students;

		public Course(int courseId, String courseName, Set<Student> students) {
			this.courseId = courseId;
			this.courseName = courseName;
			this.students = students;
		}

		public Course() {
			super();
		}

		public int getCourseId() {
			return courseId;
		}

		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}

		public String getCourseName() {
			return courseName;
		}

		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}

		public Set<Student> getStudents() {
			return students;
		}

		public void setStudents(Set<Student> students) {
			this.students = students;
		}
		
		
	    
		
	    

}
