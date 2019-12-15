package lab8_4_comparator1_source;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getName().compareTo(e2.getName())==0) {
			return Double.compare(e1.getSalary(), e2.getSalary());
		}
		return e1.getName().compareTo(e2.getName());		
	}	
}
