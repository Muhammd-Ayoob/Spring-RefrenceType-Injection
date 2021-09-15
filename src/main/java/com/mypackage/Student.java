package com.mypackage;

import com.mypackage.Department;

public class Student {

	private String studentName;
	
	private String rollNumber;
	
	private Department department;

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNumber=" + rollNumber + ", department=" + department
				+ "]";
	}
	
	
	
}
