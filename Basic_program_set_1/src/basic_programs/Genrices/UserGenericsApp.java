package basic_programs.Genrices;

import java.util.*;

class UserPojo implements Comparable<UserPojo>{

	String name;
	int id;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public UserPojo(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public int compareTo(UserPojo o) {
		// TODO Auto-generated method stub
		return this.id-o.getId();
	}

	

}

public class UserGenericsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			List<UserPojo> list = new ArrayList();
			list.add(new UserPojo("Abc",3225));
			list.add(new UserPojo("xyz",55));
			
			
			for(UserPojo obj:list)
			{
				 System.out.println(obj.getId()+":"+obj.getName());
				
			}
	}

}
/*
 * class UserArrayList<E> {
 * 
 * E e; void setValue(E e) { this.e=e; }
 * 
 * E getV(Object key) {
 * 
 * if(key.equals("yes")){ return e; }else { return null; } }
 * 
 * }
 * 
 * interface UserGenericesInterface<E> { void setValue(E e);
 * 
 * E getEle(Object oj); }
 * 
 * class UserArrayList implements UserGenericesInterface {
 * 
 * Object e;
 * 
 * @Override public void setValue(Object e) { // TODO Auto-generated method stub
 * this.e = e; }
 * 
 * @Override public Object getEle(Object index) { // TODO Auto-generated method
 * stub if (index.equals("yes")) { return e; } else { return null; } } }
 * 
 * 
 * 
 * 
 */
