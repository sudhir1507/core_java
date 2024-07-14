package multiThreading;

public class MainThreadapp {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();
		String tname=t.getName();
		System.out.println(tname);
		System.out.println(t.getPriority());
	}

}
