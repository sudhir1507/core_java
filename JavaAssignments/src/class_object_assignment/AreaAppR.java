package class_object_assignment;
import java.util.*;
class Reacangle{
	int len,wid;
	void setLengthWidth(int len,int wid) {
		this.len=len;
		this.wid=wid;
	}
	void showArea() {
		System.out.println("Area of reactangle "+ (len*wid));
	}
}
public class AreaAppR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len,wid;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length and Width of reactangle :");
		len=sc.nextInt();
		wid=sc.nextInt();
		Reacangle rr=new Reacangle();
		rr.setLengthWidth(len, wid);
		rr.showArea();
	}

}
