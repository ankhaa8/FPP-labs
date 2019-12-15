package lab10;

import java.time.LocalDate;

public class Employee {
	
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}
	@Override
	public String toString(){
		return name +" "+ hireDate;		
	}

}
