package com.java8features;

public class RunnableWIthInnerClass {

	public static void main(String[] args) {
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						
						System.out.println("Error is "+e);
					}
				}
				
			}
		};
		Thread t=new Thread(r);
		t.start();
	}

}
