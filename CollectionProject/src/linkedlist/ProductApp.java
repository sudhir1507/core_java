package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

class Product{
	int id;
	String name;
	
	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class ProductApp {

	public static void main(String[] args) {
		//LinkedList list=new LinkedList<>();
		Product p[]=new Product[5];
		p[0]=new Product(1, "aaa");
		p[1]=new Product(2, "bbb");
		p[2]=new Product(3, "ccc");
		p[3]=new Product(2, "bbb");
		p[4]=new Product(3, "ccc");
		for(Product pp:p) {
			
			System.out.println(pp.getId()+" "+pp.getName());
		}
//		Product p1=new Product(1, "aaa");
//		Product p2=new Product(2, "bbb");
//		Product p3=new Product(3, "ccc");
//		Product p4=new Product(4, "ddd");
//		Product p5=new Product(5, "eee");
		
//		list.add(p1);
//		list.add(p2);
//		list.add(p3);
//		list.add(p4);
//		list.add(p5);
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter id to search product");
//		int id=sc.nextInt();
//		boolean flag=false;
//		for(Object obj:list) {
//			Product p=(Product)obj;
//			if(p.getId()==id) {
//				flag=true;
//				break;
//			}
//		}
//		if(flag) {
//			System.out.println("Found");
//			
//		}else {
//			System.out.println("Not found");
//		}

	}

}
