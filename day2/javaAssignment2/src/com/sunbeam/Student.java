package com.sunbeam;
 import java.util.*;
 class Student implements Comparable<Student> {
	
	private int rollNo;
    private String name;
    private int marks;

	public Student() {
		
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNo, String name, int marks) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return this.rollNo == other.rollNo;
    }
	
	 @Override
	    public int compareTo(Student s) {
	        return this.rollNo - s.rollNo;
	    }


}
