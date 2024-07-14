package com.functional;

public class RunnableApp {

	public static void main(String[] args) {
		Runnable r=()-> {
				try {
					for(int i=1;i<=5;i++) {
						System.out.println(i);
						Thread.sleep(1000);
					}
				}catch(Exception e) {
					System.out.println("Error is "+e);
				}
			
		};
		Thread t=new Thread(r);
		t.start();

	}

}
