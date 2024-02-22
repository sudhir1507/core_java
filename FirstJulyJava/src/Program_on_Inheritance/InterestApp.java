package Program_on_Inheritance;
class Interest{
	protected int pamt;
	protected int irate;
	protected int dur;
	void setPRD(int pamt,int irate,int dur) {
		this.pamt=pamt;
		this.irate=irate;
		this.dur=dur;
	}
}
class CalculateInterest extends Interest{
	void calInterest() {
		System.out.println("Simple Interest "+(pamt*irate*dur)/100);
	}
}
public class InterestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateInterest SI=new CalculateInterest();
		SI.setPRD(1000, 5, 3);  
		SI.calInterest();
	}

}
