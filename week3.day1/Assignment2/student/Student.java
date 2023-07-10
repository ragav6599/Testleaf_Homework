package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("studentName");

	}
	
	public void studentDept() {
		System.out.println("studentDept");

	}
	
	public void studentId() {
		System.out.println("studentId");

	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.studentDept();
		stu.studentDept();
		stu.studentId();
		stu.deptName();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
	}

}
