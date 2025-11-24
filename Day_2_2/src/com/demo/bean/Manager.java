package com.demo.bean;

public class Manager extends Employee {
	private int incentive;

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public Manager(int empno, String name, int incentive) {
		super(empno, name);
		this.incentive = incentive;
	}

	public Manager(int empno, String name) {
		super(empno, name);
	}

	public Manager() {
		super();
	}

	@Override
	public String toString() {
		return "Manager [incentive=" + incentive + ", toString()=" + super.toString() + "]";
	}

	
}
