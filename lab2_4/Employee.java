package lab2_4;

import java.time.LocalDate;

public class Employee {
	private String name;
	private double salary;
	private LocalDate hireDate;
	
	public Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
		this.hireDate = LocalDate.of(aYear, aMonth, aDay);
		this.name = aName;
		this.salary = aSalary;
	}

	public String getName() {
		return name;
	}	
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setName(String aName) {
		name = aName;
	}	
	public void setHireDate(int aYear, int aMonth, int aDay) {
		hireDate = LocalDate.of(aYear, aMonth, aDay);
	}
	public double computeSalary() {
		return salary;
	}
}
