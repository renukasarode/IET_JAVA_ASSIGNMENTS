package service;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import beans.*;

public class EmployeeService {
	
	static Employee empArr [] = new Employee[10];
	static int cnt =0;
	static {
		empArr[0] = new salariedEmp(88888,"HR","Designer","rajan",new Date("23/4/2003"));
		empArr[1] = new salariedEmp(88888,"HR","Designer","rajan",new Date("23/4/2003"));
		empArr[2] = new ContractEmp(5,8000,"HR","Designer","rajan",new Date("23/4/2003"));
		empArr[3] = new ContractEmp(5,8000,"HR","Designer","rajan",new Date("23/4/2003"));
	    cnt = 4;
	}
	
	public static boolean addEmployee(int ch)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of the employee");
		String name = sc.next();
		System.out.println("enter the date in the format dd/MM/YY");
		String date = sc.next();
		Date newDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		try {
			 newDate = sdf.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println("enter the department of the emplooyee");
		String dept = sc.next();
		System.out.println("enter the dsignation of the emplooyee");
		String desig = sc.next();
		if(ch==1)
		{
			System.out.println("enter the salary of the employee");
			double salary = sc.nextDouble();
			Employee s1 = new salariedEmp(salary,dept,desig,name,newDate);
			if(s1!=null)
			{
				empArr[cnt] = s1;
				cnt++;
				return true;
			}
		}
		if(ch==2)
		{
			System.out.println("enter the hrs");
			float hrs = sc.nextFloat();
			System.out.println("enter the hrsCharges");
			double hrsCharges = sc.nextDouble();
			Employee c1 = new ContractEmp(hrs,hrsCharges,dept,desig,name,newDate);
			if(c1!=null)
			{
				empArr[cnt] = c1;
				cnt++;
				return true;
			}
		}
		if(ch==3)
		{
			
		}
		
		return false;
	}

	public static void displayAllEmployee() {
     for(Employee emp :empArr)
     {
    	 if(emp!=null)
    	System.out.println(emp);
     }
     
	}

	public static Employee displayByID(String id) {
       for(Employee employee:empArr)
       {
    	   if(employee!=null)
    	   {
    		   if(employee.getPid().equals(id))
    		   {
    			 return employee;  
    		   }
    	   }
       }
       return null;
	}

	public static boolean changeSalary(String id, double salary) {
		Employee emp = displayByID(id);
		if(emp!=null)
		{
			 salariedEmp s = (salariedEmp)emp;
			 s.setSalary(salary);
			 return true;
		}
		return false;
		
	}

	public static boolean changeCharges(String id, double charges) {
		Employee emp = displayByID(id);
		if(emp!=null)
		{
			 ContractEmp c = (ContractEmp)emp;
			 c.setHrscharges(charges);
			 return true;
		}
		return false;
	}

	public static Employee[] displaySalariedEmp() {
		Employee salArr[] = new salariedEmp[7];
		int index =0;
       for(Employee emp:empArr)	
       {
    	   if(emp instanceof salariedEmp) 
    	    {
    		 salArr[index++] = emp;
    		}	
		}
       return salArr;
       }
	public static Employee[] displayContractEmp() {
		Employee conArr[] = new ContractEmp[7];
		int index =0;
       for(Employee emp:empArr)	
       {
    	   if(emp instanceof ContractEmp) 
    	    {
    		 conArr[index++] = emp;
    		}	
		}
       return conArr;
       }

	public static Employee[] displayByName(String name) {
		Employee[] arr= new Employee[cnt];
		int index=0;
		for(Employee emp:empArr)
		{
			if(emp!=null)
			{
				if(emp.getPname().equals(name))
				{
					arr[index++] = emp;
				}
			}
		}
		return arr;
	}

	public static double calculateSalary(String id) {
		
      for(Employee emp:empArr)
      {
//    	 salariedEmp sEmp =  (salariedEmp)emp;
    	  if(emp!=null)
    	  {
    	 if(emp.getPid().equals(id) && (emp instanceof salariedEmp))
    	 {
    	   salariedEmp sEmp =  (salariedEmp)emp;
    	   return sEmp.calculateSalary();
    	 }
    	}
      }
      return -1;
   }
}

