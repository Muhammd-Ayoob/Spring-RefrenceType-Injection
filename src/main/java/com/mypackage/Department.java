package com.mypackage;

public class Department {

	private String deptName;
	
	private String deptCode;

	
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}

	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	/**
	 * @return the deptCode
	 */
	public String getDeptCode() {
		return deptCode;
	}

	/**
	 * @param deptCode the deptCode to set
	 */
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptCode=" + deptCode + "]";
	}

	
	
}
