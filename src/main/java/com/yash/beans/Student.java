package com.yash.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student_DTLS")
public class Student {
	    @Id
	    @Column(name="student_id")
		private int studentId;
	    
	    @Column(name="student_name")
		private String studentName;
	    
	    @Column(name="student_email")
		private String studentEmail;
	    
	    @Column(name="student_age")
		private int studentAge;

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Student(int studentId, String studentName, String studentEmail, int studentAge) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentEmail = studentEmail;
			this.studentAge = studentAge;
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

		public String getStudentEmail() {
			return studentEmail;
		}

		public void setStudentEmail(String studentEmail) {
			this.studentEmail = studentEmail;
		}

		public int getStudentAge() {
			return studentAge;
		}

		public void setStudentAge(int studentAge) {
			this.studentAge = studentAge;
		}

		@Override
		public String toString() {
			return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail=" + studentEmail
					+ ", studentAge=" + studentAge + "]";
		}	
	    
	   
		}

