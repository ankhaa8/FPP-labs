package lab8_5_source;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		new EmployeeSort();

	}
	public EmployeeSort() {
		Employee[] empArray =
			{new Employee("George", 40000, 1996,11,5),
			 new Employee("Dave", 50000.0, 2000, 1, 3),
			 new Employee("Dave", 50000.00, 2000, 1, 3),
			 new Employee("Dave", 75000, 2000, 1, 3),
			 new Employee("Richard", 45000, 2001, 2, 7)};
		
		List<Employee> empList = Arrays.asList(empArray);
		/*Collections.sort(empList, new NameComparator());
		System.out.println("NameComparator:");
		System.out.println(empList);
		
		Collections.sort(empList, new SalaryComparator());		
		System.out.println("\nSalaryComparator:");
		System.out.println(empList);
		
		Collections.sort(empList, new HireDateComparator());		
		System.out.println("\nHireDateComparator:");
		System.out.println(empList);*/
		
		Collections.sort(empList, Comparator.comparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Name) : " + empList);
        
        Collections.sort(empList, Comparator.comparing(Employee::getName).reversed());
        System.out.println("\nEmployees (Sorted by Name in descending order) : " + empList);
        
        Collections.sort(empList, Comparator.comparingDouble(Employee::getSalary)
        		.thenComparing(Employee::getName));
        System.out.println("\nEmployees (Sorted by Salary and Name) : " + empList);
		
	}

}
