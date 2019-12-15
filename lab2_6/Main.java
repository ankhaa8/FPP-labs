package lab2_6;

import java.util.List;
import java.util.Scanner;

public class Main {
	Employee[] emps = null;
	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);

		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);

		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);

//		for phase I � console output
		Scanner sc = new Scanner(System.in);
		System.out.println("A. See a report of all accounts.");
		System.out.println("B. Make a deposit.");
		System.out.println("C. Make a withdrawal.");
		System.out.print("Make a selection (A/B/C):");

		String answer = sc.next();
		if(answer.equalsIgnoreCase("A")){
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}
		else if(answer.equalsIgnoreCase("B")){
			handleDeposits();
		}
		else{
			handleWithdraw();

		}
	}
	String getFormattedAccountInfo() {
		String newline = System.getProperty("line.separator");
		String retVal = "";
		for(int i = 0; i < emps.length; ++i){
			retVal +=(emps[i].getFormattedAccountInfo()+newline);
		}
		return retVal;
	}
	void handleDeposits() {
		String n = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		//printing employee names
		for(int i = 0; i < emps.length; ++i){
			System.out.println(""+i+". "+emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
		int empChoice = sc.nextInt();
		System.out.println();

		//printing a particular employee's accounts
		Employee e = emps[empChoice];
		List<Account> list = e.getAccounts();
		for(int i = 0; i < list.size(); ++i){
			Account name = list.get(i);
			System.out.println(""+i+". "+name.getAccType().name());
		}

		//get the selected account no.
		System.out.print("Select an account: (type a number)");

		int accountIndex = sc.nextInt();
		System.out.println();
		Account name = list.get(accountIndex);

		//get the deposite amount
		System.out.print("Deposit amount: ");

		double amount = sc.nextDouble();
		System.out.println();
		e.deposit(accountIndex, amount);
		System.out.println();
		System.out.println("$"+amount+
				" has been deposited in the "+n+name.getAccType()+" account of "+ emps[empChoice].getName());

	}

	void handleWithdraw() {
		String n = System.getProperty("line.separator");
		Scanner sc = new Scanner(System.in);
		//printing employee names
		for(int i = 0; i < emps.length; ++i){
			System.out.println(""+i+". "+emps[i].getName());
		}
		System.out.print("Select an employee: (type a number)");
		int empChoice = sc.nextInt();
		System.out.println();

		//printing a particular employee's accounts
		Employee e = emps[empChoice];
		List<Account> list = e.getAccounts();
		for(int i = 0; i < list.size(); ++i){
			Account name = list.get(i);
			System.out.println(""+i+". "+name.getAccType().name());
		}

		//get the selected account no.
		System.out.print("Select an account: (type a number)");

		int accountIndex = sc.nextInt();
		System.out.println();
		Account name = list.get(accountIndex);

		//get the Withdrawal amount
		System.out.print("Withdrawal amount: ");

		double amount = sc.nextDouble();
		System.out.println();
		boolean ok=e.withdraw(accountIndex, amount);
		System.out.println();
		if(ok){
			System.out.println("$"+amount+
				" has been withdrawn from the "+n+name+" account of "+ emps[empChoice].getName());
		}
		else {
			System.out.println("Amount $"+amount+" exceeds the current balance of the "+n+name+
					" account of "+emps[empChoice].getName());
		}
	}
}


