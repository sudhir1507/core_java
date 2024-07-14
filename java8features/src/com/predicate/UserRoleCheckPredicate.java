package com.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Users{
	String role;
	String name;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Users(String role, String name) {
		super();
		this.role = role;
		this.name = name;
	}
	
}
public class UserRoleCheckPredicate {

	public static void main(String[] args) {
		{   ArrayList<Users> al = new ArrayList<Users>();
		al.add(new Users("Ram","User"));
		al.add(new Users("Shyam","User"));
		al.add(new Users("Ganesh","Admin"));
		al.add(new Users("Dinesh","User"));
		al.add(new Users("Sandeep","User"));
		Predicate<String> p = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return t.equals("Admin");
			}
			
		};
		al.forEach( (Users user)->{
			  if(p.test(user.getRole())) {
				System.out.println(user.getName()+"\t"+user.getRole());
			  }
			});
		}
		}
	}
