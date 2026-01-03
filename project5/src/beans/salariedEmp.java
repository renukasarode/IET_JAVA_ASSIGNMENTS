package beans;

import java.util.Date;

public class salariedEmp extends Employee {
	private double salary;
	private double bonus;
	public salariedEmp() {
		super();
	}
	public salariedEmp(double salary,String dept,String designation,String name,Date date) {
		super("s",dept,designation,name,date);
		this.salary = salary;
		this.bonus = salary*0.10;
	}
	
	public double getBonus(float percent)
	{
		return salary*percent;
	}
	
	public double calculateSalary()
	{
		return bonus+salary+0.10*salary+0.15*salary-0.08*salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return super.toString()+"salariedEmp [salary=" + salary + ", bonus=" + bonus + "]";
	}
	

}
