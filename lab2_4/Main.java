package lab2_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Employee[] department = new Employee[5];
		department[0] = new Professor("Bob", 85000.0,2019,11,29, 10);
		department[1] = new Professor("Harry", 80000.0,2019,11,29, 10);
		department[2] = new Professor("John", 90000.0,2019,11,29, 10);
		department[3] = new Secretory("Smith", 75000.0,2019,11,29, 200);
		department[4] = new Secretory("Tom", 65000.0,2019,11,29, 200);
		
		
		for (Employee e : department) {			
			System.out.println(e.computeSalary());					
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("See  the sum of all salaries in the department? (y/n) ");
		String answer = sc.next();
		if (answer.equalsIgnoreCase("y")) {
			double sum=0;
			for(Employee e: department)
				sum += e.computeSalary();
			System.out.println("Total amount of salary in department: " + sum);
		}
		sc.close();
	}

}
