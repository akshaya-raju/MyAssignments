package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("R.Akshaya");
	
	}
	public void studentDept() {
		System.out.println("Biomedical Engineering");
	}
	public void studentID() {
		System.out.println("8922335");
	}

	
	public static void main(String[] args) {
		Student stu=new Student();
		Department dp=new Department();
		stu.collegeCode();
		dp.collegeName();
		dp.collegeRank();
		stu.depName();
		stu.studentName();
		stu.studentID();
		stu.studentDept();
	}
}
