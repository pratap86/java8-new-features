package org.pratap.java8.collection;

public class Employee {

	private int eno;
	private String ename;
	
	public Employee(int eno, String ename) {
		this.eno = eno;
		this.ename = ename;
	}

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	@Override
	public String toString() {
		return String.format("Employee [eno=%s, ename=%s]", eno, ename);
	}
	
}
