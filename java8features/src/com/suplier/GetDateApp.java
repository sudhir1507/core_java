package com.suplier;

import java.util.Date;
import java.util.function.Supplier;

public class GetDateApp {

	public static void main(String[] args) {

		System.out.println(((Supplier<Double>)()->Math.random()).get()*100);
	}

}
