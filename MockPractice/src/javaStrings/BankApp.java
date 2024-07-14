package javaStrings;
class BackAcount{
	private String acn;
	private double balance;
	public BackAcount(String acn,double balance) {
		this.acn=acn;
		this.balance=balance;
	}
	public void deposite(double amount) {
		balance+=amount;
	}
	public void withdrow(double amount) {
		if(balance>=amount) {
			balance-=amount;
		}else {
			System.out.println("insufficent bal");
		}
	}
	public double getBalance() {
		return balance;
	}
}
class SavingAccount extends BackAcount{

	public SavingAccount(String acn, double balance) {
		super(acn, balance);
		
	}
	public void withdrow(double amount) {
		if(getBalance()-amount<100) {
			System.out.println("insufficint bal");
		}else {
			super.withdrow(amount);
		}
	}
	
}
public class BankApp {

	public static void main(String[] args) {
		
		SavingAccount s=new SavingAccount("abc123", 200);
		System.out.println("balance bw"+s.getBalance());
		s.withdrow(150);
		System.out.println("balance aw "+s.getBalance());
	}

}
