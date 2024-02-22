package javapractical;
class Voter{
	private int id;
	private String name;
	private int age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class VoteBank{
	Voter v[];
	int count=0;
	public void acceptVoter(Voter...v) {
		this.v=v;
	}
	public void showVoter() {
		
		for (int i = 0; i < v.length; i++) {
			if(v[i].getAge()>18) {
				count++;
				System.out.println(v[i].getId()+"\t"+v[i].getName()+"\t"+v[i].getAge());
			}
		}
	}
	public void showFinalCount() {
		System.out.println("Valid voter : "+count);
		System.out.println("Invalid Vote : "+(v.length-count));
	}
	
	
	
}
public class VoterBankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter v1=new Voter();
		v1.setId(1);
		v1.setName("abc");
		v1.setAge(15);
		
		Voter v2=new Voter();
		v2.setId(2);
		v2.setName("bbb");
		v2.setAge(45);
		
		Voter v3=new Voter();
		v3.setId(3);
		v3.setName("ccc");
		v3.setAge(20);
		
		Voter v4=new Voter();
		v4.setId(4);
		v4.setName("MMM");
		v4.setAge(17);
		
		Voter v5=new Voter();
		v5.setId(5);
		v5.setName("PPP");
		v5.setAge(21);
		
		Voter v6=new Voter();
		v6.setId(6);
		v6.setName("KKK");
		v6.setAge(19);
		
		VoteBank vb=new VoteBank();
		vb.acceptVoter(v1,v2,v3,v4,v5,v6);
		vb.showVoter();
		vb.showFinalCount();
	}

}
