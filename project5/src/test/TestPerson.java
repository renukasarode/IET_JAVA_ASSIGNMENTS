package test;
import java.util.Date;

import beans.Person;
import beans.salariedEmp;

public class TestPerson {

	public static void main(String[] args) {
//		double salary, double bonus,String dept,String designation,String name,Date date
       salariedEmp s1 = new salariedEmp(88888,"HR","Designer","rajan",new Date("23/4/2003"));
       salariedEmp s2 = new salariedEmp(20000,"HR","Designer","raja",new Date("23/4/2003"));
       System.out.println(s1.calculateSalary());
       System.out.println(s2.calculateSalary());
       System.out.println(s1);
       System.out.println(s2);
       
       
	}

}
