package multiThreading;
class Thrd1 extends Thread{
	public void run() {
		for(int i=1;i<6;i++) {
			System.out.println("i1 = "+i);
			try {
				sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thrd2 extends Thread{
	public void run(){
		for(int i=1;i<6;i++) {
			System.out.println("i2 = "+i);
			try {
				sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
public class ThreadApps {

	public static void main(String[] args) throws InterruptedException {
		Thrd1 t1=new Thrd1();
		t1.start();
		t1.join();
		Thrd2 t2=new Thrd2();
		t2.start();
		

	}

}
