package ConstructorPreact;
class Overloding{
	int width,depth,height;
	public Overloding(int width,int depth,int height){
		this.width=width;
		this.depth=depth;
		this.height=height;
	}
	public Overloding() {
		width=height=depth=0;
	}
	public Overloding(int length) {
		width=height=depth=length;
	}
	public int volume(){
		return width*depth*height;
	}
}
public class ConstructorOverloding {

	public static void main(String[] args) {
		
		Overloding ov=new Overloding(10, 10, 10);
		Overloding ov1=new Overloding();
		Overloding ov2=new Overloding(20);
		
		System.out.println(ov.volume());
		System.out.println(ov1.volume());
		System.out.println(ov2.volume());

	}

}
