package multiThreading;

import java.util.Scanner;

class Tab{
   	public synchronized void showTable(int no){
		try{
			for(int i=1;i<=10;i++) {
		
			System.out.println(no +" * "+i+" = "+no*i);
			if(i==5) {
				wait();
			}
			Thread.sleep(1000);
		}
		}catch(Exception e) {
			System.out.println("error is "+e);
		}
	}
	public synchronized void recall() {
		notifyAll();
	}
}
class Tw extends Thread{
	Tab tab;
	public void setTab(Tab tab) {
		this.tab=tab;
	}
	public void run() {
		tab.showTable(2);
	}
}
class Th extends Thread{
	Tab tab;
	public void setTab(Tab tab) {
		this.tab=tab;
	}
	public void run() {
		tab.showTable(3);
	}
}
public class WaitingThreadApp {

	public static void main(String[] args) {
		Tab tab=new Tab();
		
		Tw t1=new Tw();
		t1.setTab(tab);
		t1.start();
		
		Th t2=new Th();
		t2.setTab(tab);
		t2.start();
		
		do {
			Scanner sc=new Scanner(System.in);
			//System.out.println("enter string");
			String msg=sc.nextLine();
			if(msg.equals("restart")) {
				tab.recall();
			}
			if(msg.equals("stop")) {
				System.exit(0);
			}
		}while(true);
		

	}

}
