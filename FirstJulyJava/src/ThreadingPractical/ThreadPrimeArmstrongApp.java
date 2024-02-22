package ThreadingPractical;

import java.util.Scanner;

class PrimeCheck extends Thread{
	int limit;
	int count=0;
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public void run() {
		try {
			for(int i=1;i<=limit;i++) {
				int no=i;
				count=0;
				for(int j=2;j<no;j++) {
					if(no%j==0) {
						count++;
					}
					
				}
				if(count==0) {
					System.out.println("Prime "+i);
				}
				sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}
class ArmStrongCheck extends Thread{
	int limit;
	int count=0;
	int sum=0;
	public void setLimit(int limit) {
		this.limit=limit;
	}
	public void run() {
		try {
			for(int i=1;i<=limit;i++) {
				int no=i;
				count=0;
				sum=0;
				for(;no>0;no/=10) {
					count++;
				}
				no=i;
				for(;no>0;) {
					sum=sum+(int)Math.pow(no%10, count);
					no/=10;
				}
				no=i;
				if(no==sum) {
					System.out.println("Armstrong "+no);
				}
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}
public class ThreadPrimeArmstrongApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit ");
		int limit=sc.nextInt();
		PrimeCheck t1=new PrimeCheck();
		ArmStrongCheck t2=new ArmStrongCheck();
		t1.setLimit(limit);
		t1.start();
		t2.setLimit(limit);
		t2.start();

	}

}
