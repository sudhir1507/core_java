package ThreadingPractical;

import java.util.Scanner;

class NaturalNo extends Thread{
	int n;
	public void setval(int n) {
		this.n=n;
	}
	public void run() {
		
			try {
				for(int i=1;i<=n;i++){
					System.out.println(i);
					sleep(2000);
				}
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
}
public class NaturalNoThread {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of nth natural number :");
		int n=sc.nextInt();
		NaturalNo t1=new NaturalNo();
		t1.setval(n);
		t1.start();

	}

}
