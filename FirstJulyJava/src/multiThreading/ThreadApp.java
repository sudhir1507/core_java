package multiThreading;
class Abc extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread t1 runing..");
			try {
				sleep(1000);
			}catch(InterruptedException ee) {
				System.out.println(ee);
			}
		}
		
	}
}
class Xyz extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread t2 runing..");
			try {
				sleep(1100);
			}catch(InterruptedException ee) {
				System.out.println(ee);
			}
		}
		
	}
}
public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		Abc ab=new Abc();
		Xyz xy=new Xyz();
		ab.start();;
//		ab.join();
		xy.start();

	}

}
