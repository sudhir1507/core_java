package javapractical;

import java.util.Scanner;

class Product{
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class EmployeeApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Student Objects :");
		int size=sc.nextInt();
		Product p[]=new Product[size];
		for(int i=0;i<p.length;i++) {
			p[i]=new Product();
			System.out.println("Enter id name and price :");
			 int id=sc.nextInt();
			 int price=sc.nextInt();
			 String name=sc.next();
//			 sc.nextLine();
			 
			 
			
			p[i].setId(id);
			p[i].setPrice(price);
			p[i].setName(name);
			
			
			
		}
		System.out.println("Student Before Sorting :");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
		}
		for (int i = 0; i < p.length-1; i++) {
			for (int j = i+1; j < p.length; j++) {
				if (p[i].getPrice()>p[j].getPrice()) {
					Product temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("Student After Sorting :");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getPrice());
		}
		sc.close();
	}

}
