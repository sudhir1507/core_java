package Program_on_Inheritance;

import java.util.Scanner;

abstract class Values{
	int b,idx;
	public void setValue(int base,int index) {
		this.b=base;
		this.idx=index;
	}
	abstract int getResult();
}
class Power extends Values{
	int p=1;
	public int getResult() {
		for(int i=1;i<=idx;i++) {
			p=p*b;
		}
		return p;
	}
}
class SearchDigit extends Values{
	public int getResult() {
	    int val;
	    boolean flag=false;
	    while(b!=0) {
	    	int rem=b%10;
	    	if(rem==idx) {
	    		flag=true;
	    		break;
	    	}
	    	b=b/10;
	    }
	    if(flag) {
	    	return idx;
	    }else {
	    	return -1;
	    }
	}
}
public class PowerAndSearchD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int index=sc.nextInt();
		int base=sc.nextInt();
		Values obj=new Power();
		
		obj.setValue(index, base);
		int power=obj.getResult();
		System.out.println("Power is "+power);
		
		obj=new SearchDigit();
		obj.setValue(base, index);
		int result=obj.getResult();
		if(result!=-1) {
			System.out.println("Digit found "+result);
		}else {
			System.out.println("Digit Not found");
		}
	}

}
