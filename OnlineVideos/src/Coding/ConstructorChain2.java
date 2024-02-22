package Coding;

public class ConstructorChain2 {
int sum;
public ConstructorChain2() {
	this(3,5);
}
public ConstructorChain2(int n1,int n2) {
	this.sum=n1+n2;
}

public void display() {
	System.out.println(sum);
}
	public static void main(String[] args) {
		ConstructorChain2 c=new ConstructorChain2();
		c.display();
	}

}
