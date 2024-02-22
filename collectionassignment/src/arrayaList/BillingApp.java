package arrayaList;

import java.util.*;

class Product{
	int id;
	String productName;
	int quantity;
	int rate;
	int total;
	String compName;
	public Product(){
		
	}
	public Product(int id,String productName,int quantity,int rate,String compName) {
		this.id=id;
		this.productName=productName;
		this.quantity=quantity;
		this.rate=rate;
		this.compName=compName;
	}

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
}
public class BillingApp {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of product list");
		int size=sc.nextInt();
		Product p[]=new Product[size];
		System.out.println("Enter product info ");
		for(int i=0;i<p.length;i++) {
			System.out.println("Enter id Productname qunatity rate and companyname");
			int id=sc.nextInt();
			sc.nextLine();
			String pname=sc.nextLine();
			int qauntity=sc.nextInt();
			int rate=sc.nextInt();
			sc.nextLine();
			String cname=sc.nextLine();
			p[i]=new Product(id,pname,qauntity,rate,cname);	
			list.add(p[i]);
		}
        do {
        	System.out.println("\n1 View Billing Application");
        	System.out.println("2 Search Product by Name");
        	System.out.println("3 Delete product by Name");
        	System.out.println("\n Enter choice ");
        	int choice=sc.nextInt();
        	switch(choice){
        	case 1:
        		int sum=0,total;
        		System.out.println("ID\tProduct Name\tQuantity\tRate\tTotal of prodcut");
        		for(Object obj:list) {
        			Product p1=(Product)obj;
        		    total=p1.getQuantity()*p1.getRate();
        			sum=sum+total;
        			System.out.println(p1.getId()+"\t"+p1.getProductName()+"\t\t"+p1.getQuantity()+"\t\t"+p1.getRate()+"\t\t"+total);
        		}
        	     System.out.println("\t\t\t\t\tTotal Bill Is:   "+sum);
        		break;
        	case 2:
        		boolean flag=true;
        		System.out.println("Enter the name of Product ");
        		sc.nextLine();
        		String name=sc.nextLine();
        		for(Object obj:list) {
        			Product p1=(Product)obj;
        			
        			if(name.equals(p1.getProductName())) {
        				total=p1.getQuantity()*p1.getRate();
                		System.out.println("ID\tProduct Name\tQuantity\tRate\tTotal of prodcut");
            			System.out.println(p1.getId()+"\t"+p1.getProductName()+"\t\t"+p1.getQuantity()+"\t\t"+p1.getRate()+"\t\t"+total);
                        flag=false;
            			break;
        			}
        		}
        		if(flag) {
        			System.out.println("Product not found");
        		}
        		break;
        	case 3:
        		boolean isfound=false;
        		System.out.println("Enter Product id to delete");
        		int id=sc.nextInt();
        		for(Object obj:list) {
        			Product p1=(Product)obj;
        			if(id==(int)p1.getId()) {
        				int val=list.indexOf(p1);
        				list.remove(val);
        				isfound=true;
        			}
        		}
        		if(!isfound) {
        			System.out.println("Product not found to delete");
        		}
        		
        		break;
        	}
        }while(true);
	}

}
