package lab10;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String,String> map1 = new HashMap<>();
		map1.put("A", "one");
		map1.put("B", "two");
		Map<Integer,String> map2 = new HashMap<>() {
		{
			put(1,"one");
			put(2,"two");
		}
		};
		Map<Integer,String> map3 = Map.of(1,"A",2,"B",3,"C");
		
		for(String key:map1.keySet()) System.out.println(key); 
		for(String value:map2.values()) System.out.println(value); 
		for(Map.Entry<Integer, String> e:map3.entrySet()) System.out.println(e.getValue()); 
		
		map3.forEach((key,value) -> System.out.println(key + " : " + value));
		
		Map<String, Double> empSalary = new HashMap<>();
		empSalary.put("David", 76000.00);
		empSalary.put("John", 120000.00);
		empSalary.put("Mark", 95000.00);
		empSalary.put("Steven", 134000.00);
		empSalary.forEach((key,value) -> System.out.println(key + " => " + value));
		
		Employee[] emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);
		
		Map<Integer,Employee> employeesMap = new HashMap<>() {
			{
				for(Employee e: emps) put(e.hashCode(), e);
			}
		};
		employeesMap.forEach((key,value) -> System.out.println(key + " => " + value));
	}

}
