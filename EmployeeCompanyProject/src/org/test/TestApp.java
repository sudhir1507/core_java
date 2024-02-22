package org.test;
import org.emp.*;
import org.company.*;
public class TestApp {

	public static void main(String[] args) {
		Employee emp=new Employee();
		Company cc=new Company();
		emp.setId(10);
		emp.setName("abc");
		cc.show(emp);
	}

}
