package multiThreading;

//synchronized
class Tables{
	synchronized void showTable(int no) {
		try {
			for(int i=1;i<=10;i++) {
				System.out.printf("%d * %d = %d\n",no,i,no*i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}
class Four extends Thread{
	Tables table;
	void setTable(Tables table) {
		this.table=table;
	}
	public void run() {
		table.showTable(4);
	}
}
class Five extends Thread{
	Tables table;
	void setTable(Tables table) {
		this.table=table;
	}
	public void run() {
		table.showTable(5);
	}
}
public class SyancApp {

	public static void main(String[] args) {
       Tables t1=new Tables();
		
		Four tw=new Four();
		tw.setTable(t1);
		tw.start();
		
		Five th=new Five();
		th.setTable(t1);
		th.start();

	}

}
