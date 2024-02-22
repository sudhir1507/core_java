package Program_on_Inheritance;

import java.util.Scanner;

class Per{
	protected float per;
	private int sum=0;
	void calPer(int s[]) {
		for(int i=0;i<s.length;i++) {
			sum=sum+s[i];
		}
		per=((sum*100)/600);
	}
}
class CSE extends Per{
	private String name;
	private int id;
	private String address;
	private String year;
	public CSE(String name,int id,String address,String year){
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showCsePer() {
		System.out.println("Name :"+name);
		System.out.println("id :"+id);
		System.out.println("Address :"+address);
		System.out.println("Year :"+year);
		System.out.println("Percentage :"+per);
	}
}
class EXTC extends Per{
	private String name;
	private int id;
	private String address;
	private String year;
	public EXTC(String name,int id,String address,String year){
		this.name=name;
		this.id=id;
		this.address=address;
		this.year=year;
	}
	void showExtcPer() {
		System.out.println("Name :"+name);
		System.out.println("id :"+id);
		System.out.println("Address :"+address);
		System.out.println("Year :"+year);
		System.out.println("Percentage :"+per);
	}
}
	

public class ResultApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int s[]=new int[6];
		System.out.println("Enter 6 subject marks.");
		for (int i = 0; i < s.length; i++) {
			s[i]=scanner.nextInt();
		}
		System.out.println("****************************");
		CSE cse=new CSE("ABC",10,"PUNE","FE");
		cse.calPer(s);
		cse.showCsePer();
		System.out.println("****************************");
		EXTC extc=new EXTC("PQR",20,"MUMBAI","SE");
		extc.calPer(s);
		extc.showExtcPer();
		scanner.close();
	}
	
}
