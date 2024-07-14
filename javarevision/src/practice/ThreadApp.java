package practice;

class ThreadA extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				sleep(1000);
				System.out.println("A-> "+i);
			}
		}catch(InterruptedException e) {
			System.err.println(e);
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println("B-> "+i);
				sleep(1500);
			}
		}catch(InterruptedException e) {
			System.err.println(e);
		}
	}
}
public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
//		ThreadA t1=new ThreadA();
//		ThreadB t2=new ThreadB();
//		t1.start();
//		t1.join();
//		t2.start();
		Thread t=Thread.currentThread();
		int tt=t.getPriority();
		String name=t.getName();
	}

}
