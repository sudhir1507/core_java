package ThreadingPractical;

import java.util.Scanner;

class Thread1 implements Runnable{
	int n;
	void setValue(int n) {
		this.n=n;
	}
	public void run() {
		try {
			
		    for(int i=0;i<n;i++) {
		    	if(i%2==0)
		    		System.out.println("EVEN Number "+i);
		    	Thread.sleep(1000);
		    }
		   
		}catch(Exception e) {
	    	System.out.println("Error is "+e);
	    }
	}
}
class Thread2 implements Runnable{
	int n;
	void setValue(int n) {
		this.n=n;
	}
	public void run() {
		try {
			
		    for(int i=0;i<n;i++) {
		    	if(i%2==1)
		    		System.out.println("ODD Number "+i);
		    	Thread.sleep(1000);
		    }
		   
		}catch(Exception e) {
	    	System.out.println("Error is "+e);
	    }
	}
}

public class RunnableApp {

	public static void main(String[] args) {
		Thread1 obj=new Thread1();
		Thread2 obj1=new Thread2();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj1);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value of N:");
		int n=sc.nextInt();
		obj.setValue(n);
		t1.start();
		obj1.setValue(n);
		t2.start();
		
		

	}

}
