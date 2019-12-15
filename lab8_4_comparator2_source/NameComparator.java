package lab8_4_comparator2_source;

import java.util.Comparator;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		//fix here to be consistent with equals
		
		return o1.getName().compareTo(o2.getName());
		
	}

}
