package beans;

import java.util.Date;

public class Employee extends Person {
	private String dept;
	private String desg;
	public Employee() {
		super();
	}
	public Employee(String empType,String dept, String desg,String name,Date date) {
		super(empType,name,date);
		this.dept = dept;
		this.desg = desg;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	

}
