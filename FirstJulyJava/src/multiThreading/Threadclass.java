package multiThreading;
import java.io.*;
class ThreadA extends Thread{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("Hello "+" thread is "+this.isAlive() );
			if(i==2) {
				stop();
			}
			sleep(4000);
		   }
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		try {
		for(int i=0;i<5;i++) {
			System.out.println("Hi");
			sleep(5000);
		 }
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
public class Threadclass {

	public static void main(String[] args) throws InterruptedException {
		ThreadA t=new ThreadA();
		ThreadB t1=new ThreadB();
		t.start();
		t.join();
		System.out.println("thread t is "+t.isAlive());
		t1.start();
	}
}
