package com.Function;

import java.util.function.Function;

public class FunctionStringLen {

	public static void main(String[] args) {
		
			
		
        System.out.println(((Function<String,Integer>)(String t) -> t.length()).apply("sudhir"));
	}

}
