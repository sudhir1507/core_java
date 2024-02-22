package multiThreading;
class Demos implements Runnable{
	public void run() {
		try {
		for(int i=1;i<5;i++) {
			System.out.println("Hello");
			Thread.sleep(1000);
		  }
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
public class RunnableAppImp {

	public static void main(String[] args) {
		Demos d=new Demos();
		Thread t=new Thread(d);
		t.start();

	}

}
