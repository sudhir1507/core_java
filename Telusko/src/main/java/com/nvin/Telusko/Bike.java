package com.nvin.Telusko;

import org.springframework.stereotype.Component;

@Component
public class Bike implements vehicle {
	public void drive() {
		System.out.println("Bhag raha hai");
	}
}
