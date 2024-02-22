package com.simplilearn.mavenproject;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest{ 

	App obj;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
		
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}
	@Before
	public void setUp() {
		System.out.println("before test method");
		obj= new App();
	}
	@After
	public void setDown() {
		System.out.println("after test method");
		obj= new App();
	}
	@Test
	public void add() {
		System.out.println("test add method");
		assertEquals(360, obj.add(300, 60));
	}
	@Test
	public void sub() {
		System.out.println("test subtraction method");
		assertEquals(300, obj.sub(360, 60));
	}
	@Test
	public void mul() {
		System.out.println("test multiplication method");
		assertEquals(300, obj.mul(30, 10));
	}
	@Test
	public void greet() {
		System.out.println("test greet method");
		assertEquals("Hi hello",obj.greet("Hi hello"));
	}
}
