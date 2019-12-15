package lab2_3;

public class Main {
	public static void main(String[] args) {
		Manager m = new Manager("Bob",85000.0,2019,11,28);
		Employee[] e = new Employee[2];
		e[0] = new Employee("Harry",50000.0,2019,11,28);
		e[1] = new Employee("Steve",40000.0,2019,11,28);
		
		System.out.println("name="+m.getName() +", "+ "salary="+m.getSalary());
		System.out.println("name="+e[0].getName() +", "+ "salary="+e[0].getSalary());
		System.out.println("name="+e[1].getName() +", "+ "salary="+e[1].getSalary());

	}

}
