package oops_concepts;

public class Static_Main {

	public static void main(String[] args) {
		Static_keyword sk1 =new Static_keyword();
		
		Static_keyword sk2 =new Static_keyword();
		 
		sk1.age=7;
		sk1.grade="2nd";
		sk1.name="Rob";
		Static_keyword.dothis();
		
		sk2.age=8;
		sk2.grade="3rd";
		sk2.name="Shyam";
		
		sk1.displayDetails();
		sk2.displayDetails();
	}

}
