package ThreadingPractical;
class Threadd1 extends Thread{
	public void run() {
		
		System.out.println("Thread 1");
//			sleep(MIN_PRIORITY);
	}
}
class Threadd2 extends Thread{
	public void run() {
		
		System.out.println("Thread 2");
//			sleep(MAX_PRIORITY);
	}
}
class Threadd3 extends Thread{
	public void run() {
		
		System.out.println("Thread 3");
//			sleep(NORM_PRIORITY);
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		Threadd1 t1=new Threadd1();
		Threadd2 t2=new Threadd2();
		Threadd3 t3=new Threadd3();
		t1.setPriority(5);
		t2.setPriority(1);
		t3.setPriority(10);

		t1.start();
		
		t2.start();
 		
		t3.start();
		
	}

}
