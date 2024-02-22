package multiThreading;
class TablesAp extends Thread{
	int no;
	
	public synchronized void showTable(int no) {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println(no+" * "+i+" = "+no*i);
				if(i==5)
					wait();
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public synchronized void  recall() {
		try {
			notifyAll();
		}
		catch(Exception ex){
			
		}
	}

}
class Ten extends Thread{
	TablesAp table;
	void setTable(TablesAp t) {
		table=t;
	}
	public void run() {
		table.showTable(10);
	}
}
class Twelve extends Thread{
	TablesAp table;
	void setTable(TablesAp t) {
		table=t;
	}
	public void run() {
		table.showTable(12);
	}
}
public class AsyncAndSyncApp {

	public static void main(String[] args) {
		TablesAp t=new TablesAp();
		Ten ten=new Ten();
		ten.setTable(t);
		ten.start();
		
		Twelve tw=new Twelve();
		tw.setTable(t);
		tw.start();
		
		do {
			 java.util.Scanner xyz  = new java.util.Scanner(System.in);
			 String msg=xyz.nextLine();
			 if(msg.equals("restart")) {
				 t.recall();
			 }
			 if(msg.equals("stop")) {
				 System.exit(0);
			 }
			 
			}while(true);


	}

}
