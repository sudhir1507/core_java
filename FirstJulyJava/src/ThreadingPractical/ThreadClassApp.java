package ThreadingPractical;
class CapitalChar extends Thread{
	public void run() {
	try {
		for(char c='A';c<='Z';c++) {
			System.out.println("Captial : "+c);
		sleep(1000);
		}
	}catch(Exception e) {
		System.out.println("Error is "+e);
	}
	}
}
class SmallChar extends Thread{
	public void run() {
	try {
		for(char c='a';c<='z';c++) {
			System.out.println("Small : "+c);
			sleep(1000);
		}
	}catch(Exception e) {
		System.out.println("Error is "+e);
	}
	}
}
public class ThreadClassApp {

	public static void main(String[] args) {
		CapitalChar t1=new CapitalChar();
		SmallChar t2=new SmallChar();
//		t2.setPriority(10);
		t1.start();
		t2.start();

	}

}
