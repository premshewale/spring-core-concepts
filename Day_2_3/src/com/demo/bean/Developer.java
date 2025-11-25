package com.demo.bean;

import org.springframework.stereotype.Component;


public class Developer extends Employee{
 
 private int NumberOfProjects;

public int getNumberOfProjects() {
	return NumberOfProjects;
}

public void setNumberOfProjects(int numberOfProjects) {
	NumberOfProjects = numberOfProjects;
}

public Developer(int empno, String name, int numberOfProjects) {
	super(empno, name);
	NumberOfProjects = numberOfProjects;
}

public Developer(int empno, String name) {
	super(empno, name);
}

public Developer() {
	super();
}

@Override
public String toString() {
	return "Developer [NumberOfProjects=" + NumberOfProjects + ", toString()=" + super.toString() + "]";
}	
 
}
