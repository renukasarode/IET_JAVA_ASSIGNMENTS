package beans;

import java.util.Date;

public class ContractEmp extends Employee {
	private float hrs;
	private double hrscharges;
	public ContractEmp() {
		super();
	}
	public ContractEmp(float hrs, double hrscharges,String dept,String desig,String name,Date date) {
		super("c",dept,desig,name,date);
		this.hrs = hrs;
		this.hrscharges = hrscharges;
	}
	public float getHrs() {
		return hrs;
	}
	public void setHrs(float hrs) {
		this.hrs = hrs;
	}
	public double getHrscharges() {
		return hrscharges;
	}
	public void setHrscharges(double hrscharges) {
		this.hrscharges = hrscharges;
	}
	@Override
	public String toString() {
		return super.toString()+"ContractEmp [hrs=" + hrs + ", hrscharges=" + hrscharges + "]";
	}
	
}