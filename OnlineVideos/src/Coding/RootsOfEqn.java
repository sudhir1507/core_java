package Coding;

public class RootsOfEqn {

	public static void main(String[] args) {
		double a = 2, b = 4, c = 2;
		double root1,root2;
		double det=((b*b)-4*a*c)/2*a;
		if(det>0) {
			root1=(-b + Math.sqrt(det)) / (2 * a);
			root2=(-b + Math.sqrt(det)) / (2 * a);
			System.out.format("root1 =%.2f and root2=%.2f",root1,root2);
		}else if(det==0) {
			root1=root2=-b/2*a;
			System.out.format("root1=root2=%.2f",root1);
		}else {
			double real=-b/2*a;
			double imaganary=Math.sqrt(-det)/2*a;
			System.out.format("root1=%.2f+%.2fi ",real,imaganary);
			System.out.format("root2=%.2f-%.2fi ",real,imaganary);
		}

	}

}
