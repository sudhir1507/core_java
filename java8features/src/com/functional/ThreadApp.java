package com.functional;

public class ThreadApp {

	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				try {
					for(int i=1;i<=5;i++) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				}catch(Exception e) {
					System.out.println("Error is "+e);
				}
			}
		};
		t.start();
	}

}
