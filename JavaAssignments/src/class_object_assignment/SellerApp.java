package class_object_assignment;

import java.util.Scanner;

class Seller{
	int sp,cp;
	void acceptSellingCostPrice(int sp,int cp) {
		this.sp=sp;
		this.cp=cp;
	}
	void showProfitLoss() {
		if(sp>cp) {
			System.out.println("Profit is Rs."+(sp-cp));
		}else if(cp>sp) {
			System.out.println("Loss is Rs."+Math.abs(cp-sp));
		}else {
			System.out.println("No Profit No Loss..!");
		}
	}
}
public class SellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Selling and Cost Price");
		int sp=sc.nextInt();
		int cp=sc.nextInt();
		Seller ss=new Seller();
		ss.acceptSellingCostPrice(sp, cp);
		ss.showProfitLoss();
		sc.close();
	}

}
