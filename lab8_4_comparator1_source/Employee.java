package lab8_4_comparator1_source;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Employee {
	// instance fields
	private String name;
	private double salary;

	// constructor
	Employee(String aName, double aSalary) {
		name = aName;
		salary = aSalary;

	}

	// instance methods
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getName()+" "+this.salary);
		return sb.toString();
	}

	public static void main(String[] args) {
		//create employee array with three employees
		Employee[] emp = new Employee[5];
		emp[0] = new Employee("Tom", 50000);
		emp[1] = new Employee("Bob", 85000);
		emp[2] = new Employee("Harry", 100000);
		emp[3] = new Employee("Bob", 100000);
		emp[4] = new Employee("Bob", 75000);
			
		//Use Arrays.sort();		
		Arrays.sort(emp, new NameComparator());
		System.out.println("Array:");
		//print your employee array
		for(Employee e: emp) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("ArrayList:");
		//create list of Employee with three employees
		List<Employee> empL = new ArrayList<Employee>();
		for(Employee e: emp) empL.add(e);
		
		//Use Collections.sort();
		//Collections.sort(empL,new NameComparator());		
		Collections.sort(empL,(e1,e2)->e1.getName().compareTo(e2.getName()));
		
		//print your list of employee
		for(Employee e: empL) {
			System.out.println(e);
		}

	}

}
