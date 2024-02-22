package collectionsClass;
import java.util.*;
class Product{
	int id;
	String name;
	int price;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Product(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public Product() {
		
	}
}
class SortById implements Comparator{
	public int compare(Object a,Object b) {
		Product A=(Product)a;
		Product B=(Product)b;
		if(A.getId()>B.getId()) {
			return 1;
		}else if(A.getId()<B.getId()) {
			return -1;
		}else {
			return 0;
		}
	}
}
class SortByPrice implements Comparator{
	public int compare(Object a,Object b) {
		Product A=(Product)a;
		Product B=(Product)b;
		if(A.getPrice()>B.getPrice()) {
			return 1;
		}else if(A.getPrice()<B.getPrice()){
			return -1;
		}else {
			return 0;
		}
	}
}
public class ComparatorInterfaceCls {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Product(3,"Parle-G",10));
		al.add(new Product(1,"KurKure",5));
		al.add(new Product(5,"Britania",20));
		al.add(new Product(2,"Milk",12));
		al.add(new Product(4,"Sprite",25));
		
		System.out.println("Product before sort");
		for(Object o:al) {
			Product p=(Product)o;
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		System.out.println("============================");
		System.out.println("Product After sort by id");
		SortById si=new SortById();
		Collections.sort(al,si);
		for(Object o:al) {
			Product p=(Product)o;
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
		System.out.println("=================================");
		System.out.println("Product After sort by Price");
		SortByPrice sp=new SortByPrice();
		Collections.sort(al,sp);
		for(Object o:al) {
			Product p=(Product)o;
			System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
		}
		
		

	}

}
