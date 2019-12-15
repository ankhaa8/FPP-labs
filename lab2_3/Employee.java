package lab2_3;

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
	public double getSalary() {
		return salary;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void raiseSalary(double byPercent) {
		if(salary>=0) salary += salary*byPercent/100;
		else salary = 0;
	}
}
