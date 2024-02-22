package multiThreading;
class Thread1 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.printf("First = %d\t%b\n",i,isAlive());
				if(i==3) {
					stop();
				}
				sleep(5000);
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}
class Thread2 extends Thread{
	public void run() {
		try {
			for(int i=1;i<=40;i++) {
				System.out.printf("Second = %d\n",i);
				sleep(1000);
			}
		}catch(Exception e) {
			System.out.println("Error is "+e);
		}
	}
}
public class ThreadingThreadclass {

	public static void main(String[] args) throws InterruptedException {
		Thread1 t1=new Thread1();
		t1.start();
		t1.join();
		System.out.printf("First Thread status %b\n",t1.isAlive());
		Thread2 t2=new Thread2();
		t2.start();

	}

}
