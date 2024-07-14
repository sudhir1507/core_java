package com.java8features;

public class ThreadUsingInner {

	public static void main(String[] args) {
		Thread t=new Thread() {
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i);
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("Error is "+e);
					}
				}
			}
		};
		t.start();
	}

}
