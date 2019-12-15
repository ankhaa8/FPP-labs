package lab11_3_code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		
		List<Employee> list = new ArrayList<Employee>();
		for(Employee e: table.values()) {
			for(String s: socSecNums) {
				if(e.getSsn().contains(s) && e.getSalary()>80000) list.add(e);
			}
		}
		Collections.sort(list, (e1,e2)->((Employee) e1).getSsn().compareTo(((Employee) e2).getSsn()));
		return list;
	}
	
	/**
		Returns a list of Employees whose social security number is not in the input list socSecNums
	*/
	public static List<Employee> findSsnIsNotInList(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
	
		List<Employee> list = new ArrayList<>();
		for(Employee emp:table.values()) {
			boolean is = true;
			for(String s:socSecNums) {
				if(emp.getSsn().equals(s)) {is = false; break;}
			}
			if(is) list.add(emp);
		}
		
		return list;
	}
}
