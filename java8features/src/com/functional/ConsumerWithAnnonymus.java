package com.functional;

import java.util.*;
import java.util.function.Consumer;

public class ConsumerWithAnnonymus {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);

		Consumer<Integer> c = (Integer t) -> {
		                            	System.out.println(t);
		                        };

		al.forEach(c);

	}

}
