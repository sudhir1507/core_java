package Coding;
//constructorchaining from subclass
class Version{
	public Version(int v1,int v2) {
		if(v1>v2) {
			System.out.println("letest version is: "+v1);
		}else {
			System.out.println("letest version is: "+v2);
		}
	}
}
class Main extends Version{
	Main(){
		super(12,8);
	}
}
public class ConstructorChain {

	public static void main(String[] args) {
		Main m=new Main();
	}

}
