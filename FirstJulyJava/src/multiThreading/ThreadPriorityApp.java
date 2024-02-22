package multiThreading;
import java.lang.*;
class MyThread extends Thread{
	public void run() {
		System.out.println("This is thread "+this.getName()+" - > "+this.getPriority());
		
	}
}
public class ThreadPriorityApp {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		MyThread t3=new MyThread();
		System.out.println("Current thread "+Thread.currentThread().getName()+" priority "+t1.getPriority());
		System.out.println("Thread1  "+t1.getPriority());
		System.out.println("Thread2  "+t2.getPriority());
		System.out.println("Thread3  "+t3.getPriority());
		
		t1.setPriority(2);
		t2.setPriority(10);
		t3.setPriority(5);
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("------------------------------------");
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		
		
	}

}
