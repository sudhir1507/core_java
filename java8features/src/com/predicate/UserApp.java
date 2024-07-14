//package com.predicate;
//
//import java.util.ArrayList;
//import java.util.function.Predicate;
//
//class User{
//	String name;
//	String role;
//	public User(String name, String role) {
//		super();
//		this.name = name;
//		this.role = role;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	
//}
//public class UserApp {
//
//	public static void main(String[] args) {
//		ArrayList<User> list=new ArrayList<>();
//		list.add(new User("pravin","user"));
//		list.add(new User("Parshuram", "user"));
//		list.add(new User("ram", "admin"));
//		list.forEach((User u)->{
//			if(((Predicate<String>)(String t)->t.equals("admin")).test(u.getRole())) {
//				System.out.println(u.getName()+"\t"+u.getRole());
//			}
//		});
//		
//	}
//
//}
