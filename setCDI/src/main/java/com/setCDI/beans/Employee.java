package com.setCDI.beans;

public class Employee {
	private int employeeNo;
	private String fullName;
	private double salary;
	private String mailId;
	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", fullName=" + fullName + ", salary=" + salary + ", mailId="
				+ mailId + "]";
	}
	
}
