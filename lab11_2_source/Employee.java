package lab11_2_source;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private String firstName;
	private String lastName;
	private HashMap<String,Double> salaryRecord;
	
	public Employee() {
		salaryRecord = new HashMap<String,Double>();
	}
	public void addEntry(String date, double salary) {
		//implement
		salaryRecord.put(date, salary);
	}
	public void printPaymentAmount(String date) {
		//implement
		if(salaryRecord.containsKey(date))
			System.out.println(firstName + " "+ lastName + " " + salaryRecord.get(date) + " on " + date);
		else 
			System.out.println(firstName + " "+ lastName + " did not receive a paycheck on " + date);
		
	}
	public void printAveragePaycheck() {
		//implement
		double sum = 0;
		for(Map.Entry<String, Double> e:salaryRecord.entrySet()) sum += e.getValue(); 
		System.out.println("Average paycheck for" + " " + firstName + " "+  lastName + " " + sum/salaryRecord.size());
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.setFirstName("Jim");
		e.setLastName("Jones");
		for(int i = 0; i < 12; ++i) {
			e.addEntry(i+"/15/2011", 3070+5*i);
			//System.out.println(i+"/15/2011" + 3070+5*i);
		}
		e.printPaymentAmount("3/15/2011");
		e.printPaymentAmount("5/15/2010");
		e.printAveragePaycheck();
		
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
