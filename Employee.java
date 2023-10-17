package com.fis.fileio;

import java.io.Serializable;

public class Employee implements Serializable{
	private int empNo;
	private String empName;
	private float empSal;
	private String empDesg;
	private String empAdd;

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public String getEmpAdd() {
		return empAdd;
	}

	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empNo, String empName, float empSal, String empDesg, String empAdd) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesg = empDesg;
		this.empAdd = empAdd;
	}

	@Override
	public String toString() {
		return "[empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + ", empDesg=" + empDesg
				+ ", empAdd=" + empAdd + "]";
	}

}
