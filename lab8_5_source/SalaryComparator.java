package lab8_5_source;

import java.util.Comparator;
import java.util.Date;

public class SalaryComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {		
		
		String name1 = e1.getName();
		String name2 = e2.getName();
		Date hireDate1 = e1.getHireDate();
		Date hireDate2 = e2.getHireDate();
		double salary1 = e1.getSalary();
		double salary2 = e2.getSalary();
		
		if(Double.compare(salary1, salary2)!= 0) {
			return Double.compare(salary1, salary2);
		}
		
		if(name1.compareTo(name2) != 0) {
			return name1.compareTo(name2);
		}
		
		return hireDate1.compareTo(hireDate2);
	}
}
