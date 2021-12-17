package com.setCDI.beans;

import java.util.Set;
import com.setCDI.beans.Employee;

public class Office {
	private int branchNo;
	private String branchName;
	private String location;
	private Set<Employee> employee;
	
	public Office(int branchNo) {
		this.branchNo = branchNo;
	}
	
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Office [branchNo=" + branchNo + ", branchName=" + branchName + ", location=" + location + ", employee="
				+ employee + "]";
	}
	
}
