package co.edureka;

public class Employeee {
	int eid;
	String ename;
	int esalary;
	
	public Employeee() {
		
	}
	public Employeee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Override
	public String toString() {
		return "Employeee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
	
}
