package class_object_assignment;
class Products{
	private int id;
	private String name;
	private int qty;
	private int rate;
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
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	
}
class CalculateBill{
	void calBill(Products ...p) {
		int totalbill[]=new int[p.length];
		int TOTALBILL=0;
		System.out.println("ProductId\tProductName\tQty\tRate\tToatalBill");
		for(int i=0;i<p.length;i++) {
			totalbill[i]=p[i].getQty()*p[i].getRate();
			System.out.println(p[i].getId()+"\t\t"+p[i].getName()+"\t\t"+p[i].getQty()+"\t"+p[i].getRate()+"\t  "+totalbill[i]);
			TOTALBILL=TOTALBILL+totalbill[i];
		}
		System.out.println("-----------------------------------------------------");
		System.out.println("\t\t\t    Total Bill Of Order : "+TOTALBILL);
	}
}
public class BillingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p1=new Products();
		p1.setId(1);
		p1.setName("Parle");
		p1.setQty(10);
		p1.setRate(5);
		
		Products p2=new Products();
		p2.setId(2);
		p2.setName("Cadbury");
		p2.setQty(10);
		p2.setRate(10);
		
		Products p3=new Products();
		p3.setId(3);
		p3.setName("Oreo");
		p3.setQty(10);
		p3.setRate(10);
		
		CalculateBill cb=new CalculateBill();
		cb.calBill(p1,p2,p3);
		

	}

}
