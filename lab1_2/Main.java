package lab1_2;

public class Main {
	public static void main(String[] args) {
		Employee e = new Employee("Harry",2019,1,14);		
		e.createNewSavings(300);
		e.createNewChecking(300);
		e.createNewRetirement(300);
		System.out.println(e.getFormattedAccountInfo());
	}
}
