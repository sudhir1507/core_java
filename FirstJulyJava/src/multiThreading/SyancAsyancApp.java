package multiThreading;

//asynchronization
class Table{
	void showTable(int no) {
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
class Two extends Thread{
	Table table;
	void setTable(Table table) {
		this.table=table;
	}
	public void run() {
		table.showTable(2);
	}
}
class Three extends Thread{
	Table table;
	void setTable(Table table) {
		this.table=table;
	}
	public void run() {
		table.showTable(3);
	}
}
public class SyancAsyancApp {

	public static void main(String[] args) {
		Table t1=new Table();
		
		Two tw=new Two();
		tw.setTable(t1);
		tw.start();
		
		Three th=new Three();
		th.setTable(t1);
		th.start();

	}

}

