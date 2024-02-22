package oops_concepts;

/*
 * exercise
 * create a Bank_Account class
 * create private member variables for account no,account name and account balance
 * create methods to deposit and withdraw the amount and to display the current balance
 * create an constructor with arguments for account no,account name and account balance
 * create an class BankAccount_Main with a main method
 * create an object of Bank_Account
 * call the methods to deposit and withdraw the money from bank account and display the current balance  
 */






public class Bank_Account {
	private long acNo;
	private String acName;
	private double acBalance;
	
	public void deposit(double amt) {
		if(amt>0) {
			acBalance=acBalance+amt;
			System.out.println("Successfully deposited $ "+ amt);
		}else {
			System.out.println("cannot deposit "+ amt);
		}
	}
	public void withdraw(double amt) {
		if(amt>0) {
			acBalance=acBalance-amt;
			System.out.println("Successfully deposited $ "+ amt);
		}else {
			System.out.println("cannot deposite "+ amt);
		}
	}
	public void displayCurrentBalance() {
		System.out.println("Your current balancce is $ "+ acBalance);
	}
	public Bank_Account(long acNo,String acName,double acBalance ) {
		this.acNo=acNo;
		this.acName=acName;
		this.acBalance=acBalance;
	}
}
